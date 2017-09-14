package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;  // will validate against
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		// Assign the value from passed in from our annotation
		coursePrefix = theCourseCode.value();
	}
	
	/*
	 * Add your own custom business logic here !
	 * @param theCode : HTML Form Data Entered by the user
	 * @param theConstraintValidtorContext:Give additional error messages here
	 */
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		/*
		 * Validation logic: Test if the form data starts with coursePrefix
		 * Need to check for null
		 */
		
		boolean result;
		
		if(theCode != null) {							// If has input, check the course prefix
		
			result = theCode.startsWith(coursePrefix);
		}
		else {
			result = true;								// If null, the field is not required 
		}
		
		return result;
	}

}
