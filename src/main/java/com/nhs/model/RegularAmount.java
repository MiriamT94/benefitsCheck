package com.nhs.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;

import com.nhs.validator.FrequencyCheck;

@FrequencyCheck
public class RegularAmount {
	private Frequency freq;
//@Pattern(message="incorrect currency format", regexp="/^£?[1-9]{1,3}(,\\d{3})*(\\.\\d{2})?$/")
	@NumberFormat(pattern = "#.##")
	private String amt;

	public Frequency getFreq() {
		return freq;
	}

	public void setFreq(Frequency freq) {
		this.freq = freq;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

}
