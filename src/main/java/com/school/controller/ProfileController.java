/**
 * 
 */
package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.model.ProfileResponse;
import com.school.model.StudentProfile;
import com.school.service.impl.ProfileServiceImpl;
import com.school.util.ResponseType;;

/**
 * @author Manchanda
 *
 */
@RestController
public class ProfileController {

	@Autowired
	private ProfileServiceImpl service;

	
	/**
	 * This method will create new student record into database.
	 * @param profile
	 * @return
	 */
	@RequestMapping(value="/student/create", method=RequestMethod.POST)
	public ProfileResponse createNewStudent(@RequestBody StudentProfile profile) {
		ProfileResponse response = service.createStudentProfile(profile);
		return response;
		
	}
	
	/**
	 * This method will be called when user wanted to retrieve records of student.
	 * @param enrollmentId
	 * @return
	 */
	@RequestMapping(value="/student/view", method=RequestMethod.GET)
	public ProfileResponse viewStudentDetailsBasedOnEnrollmentId(@RequestParam(value="enrollmentId", required=false) Integer enrollmentId, 
			@RequestParam(name="userName", required=false) String userName) {
		if(enrollmentId==null && !StringUtils.isEmpty(userName)) {
			ProfileResponse response = service.viewStudentProfile(userName);
			return response;
		} else if(enrollmentId!=null && StringUtils.isEmpty(userName)) {
			ProfileResponse response = service.viewStudentProfile(enrollmentId);
			return response;
		} 
		ProfileResponse response = new ProfileResponse();
		response.setCode("400");
		response.setMessage("Either EnrollmentId or Username is mandatory");
		response.setType(ResponseType.ERROR);
		return response;
		
	}
	
	/**
	 * This method will take care of updating student record.
	 * @param profile
	 * @return
	 */
	@RequestMapping(value="/student/update", method=RequestMethod.PUT)
	public ProfileResponse updateStudentDetails(@RequestBody StudentProfile profile) {
		ProfileResponse response = service.updateStudentProfile(profile);
		return response;
		
	}

	/**
	 * This method will delete/disable student from database
	 * @param enrollmentId
	 * @param disable
	 * @return StudentProfile
	 */
	@RequestMapping(value="/student/delete/{enrollmentId}/{disable}", method=RequestMethod.GET)
	public ProfileResponse deleteStudentDetails(@PathVariable(name="enrollmentId") Integer enrollmentId,
			@PathVariable(name="disable") boolean disable) {
		ProfileResponse response = service.deleteStudentProfile(enrollmentId , disable);
		return response;
		
	}
	
}
