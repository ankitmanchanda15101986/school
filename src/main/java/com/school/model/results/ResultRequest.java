/**
 * 
 */
package com.school.model.results;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author Manchanda
 *
 */
@Component
public class ResultRequest {

	private List<Result> result;
	
	/**
	 * @return the result
	 */
	public List<Result> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(List<Result> result) {
		this.result = result;
	}

}
