/**
 * 
 */
package com.school.util.results;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.ResultResponse;
import com.school.model.results.Subjects;
import com.school.model.results.SubjectsRelatedResults;

/**
 * @author Manchanda
 *
 */
@Component
public class ResultHelper {

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
				response.setMessage("Retrieved records successfully");
			} else {
				response.setMessage("No records found");
			}
			finalResultList.add(resultResponse);
		} else {
			response.setCode("400");
			response.setMessage("Caught some error while retrieving record");
		}
		response.setStudentResult(finalResultList);
		return response;
	}
}
