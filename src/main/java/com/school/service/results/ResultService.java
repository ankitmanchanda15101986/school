/**
 * 
 */
package com.school.service.results;

import java.util.Map;

import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.Subjects;
import com.school.util.results.ExamType;
import com.school.util.results.ResultType;

/**
 * @author Manchanda
 *
 */
public interface ResultService {
	public Map<Integer, Subjects> getAllSubjects();
	
	public ProfileResponse getStudentResult(Result result);
}
