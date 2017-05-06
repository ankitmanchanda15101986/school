/**
 * 
 */
package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;
import com.school.service.profile.impl.ProfileServiceImpl;
import com.school.util.ResponseType;;

/**
 * @author Manchanda
 *
 */
@RestController
public class StudentProfileController {

	@Autowired
	private ProfileServiceImpl service;
	
		
	/**
	 * This operation is only for admin user. (Admin)
	 */
	@RequestMapping(value="/student/create", method=RequestMethod.POST)
	public ProfileResponse createNewStudent(@RequestBody StudentProfile profile) {
		ProfileResponse response = service.createStudentProfile(profile);
		return response;
		
	}
	
	/**
	 * Parent can select child and view there profile. (Admin + Parent + Teacher)
	 */
	@RequestMapping(value="/student/view", method=RequestMethod.GET)
	public ProfileResponse viewStudentDetailsBasedOnEnrollmentId(@RequestParam(value="enrollmentId", required=false) Integer enrollmentId,
			@RequestParam(value="userName", required=false) String userName) {
			ProfileResponse response = service.viewStudentProfile(userName, enrollmentId);
			return response;		
	}
	
	/**
	 * Parent can update there profile data. (Admin + Parent)
	 */
	@RequestMapping(value="/student/update", method=RequestMethod.PUT)
	public ProfileResponse updateStudentDetails(@RequestBody StudentProfile profile) {
		ProfileResponse response = service.updateStudentProfile(profile);
		return response;
		
	}

	/**
	 * This operation is only for admin user. (Admin)
	 */
	@RequestMapping(value="/student/delete/{enrollmentId}/{disable}", method=RequestMethod.GET)
	public ProfileResponse deleteStudentDetails(@PathVariable(name="enrollmentId") Integer enrollmentId,
			@PathVariable(name="disable") boolean disable) {
		ProfileResponse response = service.deleteStudentProfile(enrollmentId , disable);
		return response;
		
	}
	
}
