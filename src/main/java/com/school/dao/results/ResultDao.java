/**
 * 
 */
package com.school.dao.results;

import java.util.List;
import java.util.Map;

import com.school.model.results.Result;
import com.school.model.results.Subjects;

/**
 * @author Manchanda
 *
 */
public interface ResultDao {
	public Map<Integer, Subjects> retrieveSubjectList() throws Exception;
	
	public List<Result> getStudentResult(Result result) throws Exception;
}
