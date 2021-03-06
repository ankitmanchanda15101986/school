/**
 * 
 */
package com.school.dao.results.impl4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.dao.results.ResultDao;
import com.school.dao.results.crud.ResultCrudRepository;
import com.school.dao.results.crud.SubjectAssignationCrudRepository;
import com.school.dao.results.crud.SubjectsCrudRepository;
import com.school.model.results.Result;
import com.school.model.results.SubjectAssignationRequest;
import com.school.model.results.Subjects;

/**
 * @author Manchanda
 *
 */
@Repository
public class ResultDaoImpl implements ResultDao {

	@Autowired
	private SubjectsCrudRepository subjectRepository;
	
	@Autowired
	private ResultCrudRepository resultRepository;
	
	@Autowired
	private SubjectAssignationCrudRepository subjectAssignationRepository;
	
	
	/* (non-Javadoc)
	 * @see com.school.dao.results.ResultDao#retrieveSubjectList()
	 */
	@Override
	public Map<Integer, Subjects> retrieveSubjectList() throws Exception {
		Map<Integer, Subjects> subjectsMap = new HashMap<Integer, Subjects>();
		Iterable<Subjects> iterable = subjectRepository.findAll();
		for (Subjects subjects : iterable) {
			if(subjects != null) {
				subjectsMap.put(subjects.getSubjectCode(),subjects);
			}
		}
		return subjectsMap;
	}
	
	
	@Override
	public List<Result> getStudentResult(Result result) throws Exception{
		List<Result> results = resultRepository.getResult(result.getEnrollmentId(), result.getExamType(), result.getType(), 
				result.getClassStandard());
		return results;
	}


	@Override
	public List<Result> insertOrUpdateStudentResult(List<Result> resultRequest) throws Exception {
		Iterable<Result> resultIterable = resultRepository.save(resultRequest);
		List<Result> resultList = new ArrayList<Result>();
		for (Result result : resultIterable) {
			resultList.add(result);
		}
		return resultList;
	}


	@Override
	public SubjectAssignationRequest assignSubjects(SubjectAssignationRequest request) throws Exception {
		request = subjectAssignationRepository.save(request);
		return request;
	}


	@Override
	public SubjectAssignationRequest retrieveSubject(Integer enrollmentId) throws Exception {
		return subjectAssignationRepository.retrieveSubjects(enrollmentId);
	}

}
