package com.nhs.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.nhs.model.Frequency;
import com.nhs.model.RegularAmount;

public class FrequencyValidator implements ConstraintValidator<FrequencyCheck, RegularAmount> {

	public boolean isValid(RegularAmount value, ConstraintValidatorContext context) {
		Frequency f = value.getFreq();
		
		Double amt = Double.valueOf(value.getAmt());
		double amtPence=amt*100;
		
		if (f != Frequency.MONTH)
			return amtPence % f.getFrequency() == 0;
		return true;
	}

	public void initialize(FrequencyCheck constraintAnnotation) {
		// TODO Auto-generated method stub

	}

}
