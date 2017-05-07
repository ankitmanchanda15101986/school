/**
 * 
 */
package com.school.dao.results;

import java.util.List;
import java.util.Map;

import com.school.model.results.Result;
import com.school.model.results.SubjectAssignationRequest;
import com.school.model.results.Subjects;

/**
 * @author Manchanda
 *
 */
public interface ResultDao {
	
	public Map<Integer, Subjects> retrieveSubjectList() throws Exception;
	
	public List<Result> getStudentResult(Result result) throws Exception;
	
	public List<Result> insertOrUpdateStudentResult(List<Result> result) throws Exception;
	
	public SubjectAssignationRequest assignSubjects(SubjectAssignationRequest request) throws Exception;
	
	public SubjectAssignationRequest retrieveSubject(Integer enrollmentId) throws Exception;
	
}
