package com.nhs.test;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.internal.util.annotationfactory.AnnotationDescriptor;
import org.hibernate.validator.internal.util.annotationfactory.AnnotationFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.beanvalidation.CustomValidatorBean;

import com.nhs.model.Frequency;
import com.nhs.model.RegularAmount;
import com.nhs.validator.FrequencyCheck;
import com.nhs.validator.FrequencyValidator;

@RunWith(MockitoJUnitRunner.class)
public class FreqValidatorTest {
//	private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

	@Mock
	private ConstraintValidatorContext constraintValidatorContext;

	  @Test
	public void testIsValid() {
//
//	    when(nameMatch.first()).thenReturn("firstname");
//	    when(nameMatch.second()).thenReturn("lastname");

		FrequencyValidator nameValidator = new FrequencyValidator();
//	    nameValidator.initialize(nameMatch);

		RegularAmount amt = new RegularAmount();
		amt.setAmt("1000.57");
		amt.setFreq(Frequency.QUARTER);

		boolean result = nameValidator.isValid(amt, constraintValidatorContext);
		assertTrue(result);
	}

//	@Test
//	public void testSuccess() {
//		FrequencyValidator validr=new FrequencyValidator();
//		RegularAmount amt = new RegularAmount();
//		amt.setAmt("1000.00");
//		amt.setFreq(Frequency.WEEK);
//	Errors err=new BeanPropertyBindingResult(validAddress, "validAddress");
//
//    assertFalse(errors.hasErrors());
//		 
//	        //Show errors
//	        if (constraintViolations.size() > 0) {
//	            for (ConstraintViolation<RegularAmount> violation : constraintViolations) {
//	                System.out.println(violation.getMessage());
//	            }
//	        } else {
//	            System.out.println("Valid Object");
//	        }
//	}

}
