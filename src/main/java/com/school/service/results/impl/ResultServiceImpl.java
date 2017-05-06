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
import com.school.model.results.Subjects;
import com.school.service.results.ResultService;
import com.school.util.results.ExamType;
import com.school.util.results.ResultHelper;
import com.school.util.results.ResultType;
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
			response = validate.validate(result);
			if(response != null && response.getErrors().size() ==0) {
				resultList = dao.getStudentResult(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response = helper.prepareFinalResult(resultList, getAllSubjects());
		return response;
	}

}
