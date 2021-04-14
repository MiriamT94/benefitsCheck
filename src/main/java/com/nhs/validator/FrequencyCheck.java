package com.nhs.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.TYPE })
@Retention(RUNTIME)

@Constraint(validatedBy = { FrequencyValidator.class })
public @interface FrequencyCheck {
	String message() default "amount is not consistent with frequency";
//	String message() default "{frequency.error.message}";
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
