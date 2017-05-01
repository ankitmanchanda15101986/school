/**
 * 
 */
package com.school.dao.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.model.ParentLogin;
import com.school.model.StudentProfile;

/**
 * @author Manchanda
 *
 */
public interface ParentLoginOperationCrudRepository extends CrudRepository<ParentLogin, String> {

}
