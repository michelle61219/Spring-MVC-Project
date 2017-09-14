/*
 * Create a custom java annotation.
 */

package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstraintValidator.class) // Helper class that contains business rules/ validation logic
@Target({ElementType.METHOD, ElementType.FIELD}) 			   // @Target: Where you want to apply this annotation?
@Retention(RetentionPolicy.RUNTIME) 			 			   // @Retain: How long will the marked annotation be stored or used ? 
												 			   // (Retain this annotation in the JAva class file and process it at runtime) 
public @interface CourseCode {

	// Define default course code
	public String value() default "LUV";
	
	// Define default error message
	public String message() default "must start with LUV";
	
	// Define default groups
	public Class<?>[] groups() default {};					 // Not using it, so empty collection (Groups: cna group related constraints)
		
	// define default payloads
	public Class<? extends Payload>[] payload() default {};  // Not using it, so give default payloads.
															 // (Payloads: Provide custom details error messages)

}
