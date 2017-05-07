/**
 * 
 */
package com.school.service.results.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.results.impl4.ResultDaoImpl;
import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.ResultRequest;
import com.school.model.results.Subjects;
import com.school.service.results.ResultService;
import com.school.util.results.ResultHelper;
import com.school.validate.results.ValidateResult;

/**
 * @author Manchanda
 *
 */
@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	private ResultDaoImpl dao;
	
	@Autowired
	private ResultHelper helper;
	
	@Autowired
	private ValidateResult validate;
	/* (non-Javadoc)
	 * @see com.school.service.results.ResultService#getAllSubjects()
	 */
	@Override
	public Map<Integer, Subjects> getAllSubjects() {
		Map<Integer, Subjects> subjectsMap = null;
		try {
			subjectsMap = dao.retrieveSubjectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subjectsMap;
	}
	
	//int enrollmentId, ExamType examType, ResultType resultType, String classStandard
	@Override
	public ProfileResponse getStudentResult(Result result) {
		List<Result> resultList = null;
		ProfileResponse response = null;
		try {
			response = validate.validate(result, "get");
			if(response != null && response.getErrors().size() ==0) {
				resultList = dao.getStudentResult(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response = helper.prepareFinalResult(resultList, getAllSubjects());
		return response;
	}

	@Override
	public ProfileResponse insertOrUpdateStudentResult(ResultRequest resultRequest) {
		ProfileResponse response = new ProfileResponse();
		List<Result> resultList = null;
		boolean errorflag = false;
		if(resultRequest != null) {
			// Validation Request
			for ( Result result : resultRequest.getResult()) {
				response = validate.validate(result, "insert");
				if(response!= null && !response.getErrors().isEmpty()) {
					errorflag = true;
					break;
				}
			}
			if(!errorflag) {
				try {
					resultList = dao.insertOrUpdateStudentResult(resultRequest.getResult());
				} catch (Exception e) {
					e.printStackTrace();
				}
				response = helper.prepareFinalResult(resultList, getAllSubjects());
			}
		} else {
			response.setCode("400");
			response.setMessage("Invalid Request");
		}
		return response;
	}

}
