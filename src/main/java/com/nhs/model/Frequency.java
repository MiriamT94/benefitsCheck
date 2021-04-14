package com.nhs.model;

public enum Frequency {
	WEEK, TWO_WEEK, FOUR_WEEK, MONTH, QUARTER, YEAR;

	public int getFrequency() {
		switch (this) {
		case WEEK:
			return 1;
		case TWO_WEEK:
			return 2;
		case FOUR_WEEK:
			return 4;
		case MONTH:
			return 1;
		case QUARTER:
			return 13;
		case YEAR:
			return 52;
		default:
			return 1;
		}
	}
}
