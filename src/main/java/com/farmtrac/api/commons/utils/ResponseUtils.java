package com.farmtrac.api.commons.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static ResponseEntity<Object> buildSucessResponse(Object data) {
		Map<String, Object> response = new HashMap();
		response.put(Constants.DATA_KEY, data);
		response.put(Constants.STATUS_KEY, Constants.STATUS_SUCCESS);
		return ResponseEntity.ok().body((Object) response);
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static ResponseEntity<Object> buildFailureResponse(Exception exception) {
		Map<String, Object> errorDetails = new HashMap();
		errorDetails.put(Constants.MESSAGE_KEY, exception.getMessage());
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body((Object) errorDetails);
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static ResponseEntity<Object> buildFailureResponse(Exception exception, Object mockData) {
		Map<String, Object> errorDetails = new HashMap();
		errorDetails.put(Constants.MESSAGE_KEY, exception.getMessage());
		errorDetails.put(Constants.DATA_KEY, mockData);
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body((Object) errorDetails);
	}
	
	
	
	/**
     * 
     * @param obj
     * @return
     */
    public static ResponseEntity<Object> buildFailureResponse(Exception exception,Object errorInfo,HttpStatus status ) {
        Map<String, Object> errorDetails = new HashMap();
        errorDetails.put(Constants.STATUS, Constants.STATUS_FAILURE);
        errorDetails.put(Constants.ERROR_MESSAGE, exception.getMessage());
        if(errorInfo!=null)
            errorDetails.put(Constants.ERROR_DETAILS, errorInfo);
      
        return ResponseEntity.status(status==null?HttpStatus.EXPECTATION_FAILED:status).body((Object) errorDetails);
    }
}
