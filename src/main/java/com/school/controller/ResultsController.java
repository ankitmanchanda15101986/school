/**
 * 
 */
package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.ResultRequest;
import com.school.service.results.impl.ResultServiceImpl;
import com.school.util.results.ResultHelper;

/**
 * @author Manchanda
 *
 */
@RestController
public class ResultsController {

	@Autowired
	private ResultServiceImpl service;
	
	@Autowired
	private ResultHelper helper;
	
	/**
	 * (Parent + Teacher)
	 * @param enrollmentId
	 * @param examType
	 * @param resultType
	 * @param classStandard
	 * @return
	 */
	@RequestMapping(value="/retrieveResult",  method=RequestMethod.GET)
	public ProfileResponse getResult(@RequestParam("enrollmentId") int enrollmentId, 
			@RequestParam("examType") String examType, @RequestParam("resultType") String resultType, 
			@RequestParam("classStandard") String classStandard) {
		Result result = helper.convertToResult(enrollmentId, examType, resultType, classStandard);
		ProfileResponse response = service.getStudentResult(result);
		return response;
		
	}
	
	/**
	 * (Teache + Admin)
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/insertOrUpdateResult", method=RequestMethod.POST)
	public ProfileResponse insertOrUpdateResult(@RequestBody ResultRequest request) {
		ProfileResponse response = service.insertOrUpdateStudentResult(request);
		return response;
		
	}
}
