/**
 * 
 */
package com.school.util.results;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.ResultResponse;
import com.school.model.results.SubjectAssignationRequest;
import com.school.model.results.SubjectAssignationResponse;
import com.school.model.results.Subjects;
import com.school.model.results.SubjectsRelatedResults;

/**
 * @author Manchanda
 *
 */
@Component
public class ResultHelper {
	
	public Result convertToResult(int enrollmentId, String examType, String resultType, String classStandard) {
		Result result = new Result();
		result.setEnrollmentId(enrollmentId);
		result.setExamType(examType);
		result.setType(resultType);
		result.setClassStandard(classStandard);
		return result;
	}

	public ProfileResponse prepareFinalResult(List<Result> resultList, Map<Integer, Subjects> map) {
		ProfileResponse response = new ProfileResponse();
		List<ResultResponse> finalResultList = new ArrayList<ResultResponse>();
		List<SubjectsRelatedResults> subjectRelatedList = new ArrayList<SubjectsRelatedResults>();
		ResultResponse resultResponse = new ResultResponse();
		if(resultList!= null && !resultList.isEmpty()) {
			for (Result result : resultList) {
				resultResponse.setEnrollmentId(result.getEnrollmentId());
				SubjectsRelatedResults subjectResult = new SubjectsRelatedResults();
				subjectResult.setExamDate(result.getExamDate());
				subjectResult.setMarks(result.getMarks());
				subjectResult.setStatus(result.getStatus());
				subjectResult.setSubjectCode(result.getSubjectCode());
				if(map != null && map.size() >0) {
					Subjects sub = map.get(result.getSubjectCode());
					if(sub != null) {
						subjectResult.setSubjectName(sub.getSubjectName());
					}
				}
				subjectRelatedList.add(subjectResult);
			}
			resultResponse.setResult(subjectRelatedList);
		}
		if(resultResponse != null && resultResponse.getResult() != null) {
			response.setCode("200");
			if(resultResponse.getResult().size() >0) {
				response.setMessage("Operation successfully");
			} else {
				response.setMessage("No records found");
			}
			finalResultList.add(resultResponse);
		} else {
			response.setCode("400");
			response.setMessage("Caught some error please contact administrator");
		}
		response.setStudentResult(finalResultList);
		return response;
	}
	
	
	public ProfileResponse prepareFinalResult(SubjectAssignationRequest result, Map<Integer, Subjects> map) {
		ProfileResponse response = new ProfileResponse();
		List<SubjectAssignationResponse> subAssignationResponse = new ArrayList<SubjectAssignationResponse>();
		List<Subjects> subList = new ArrayList<Subjects>();
		SubjectAssignationResponse subjectAssignationResponse = new SubjectAssignationResponse();
		if(result != null && StringUtils.isEmpty(result.getSubjectCode())) {
			subjectAssignationResponse.setEnrollmentId(result.getEnrollmentId());
			for (String value : result.getSubjectCode().split(",")) {
				if(map != null && !map.isEmpty()) {
					Subjects sub = map.get(value);
					subList.add(sub);
				}
			}
			subjectAssignationResponse.setSubjectList(subList);
			response.setCode("200");
			response.setMessage("Operation Successful");
			response.setAssignedSubject(subAssignationResponse);
		} else {
			response.setCode("400");
			response.setMessage("Caught some error please contact administrator");
		}
		return response;
	}

}
