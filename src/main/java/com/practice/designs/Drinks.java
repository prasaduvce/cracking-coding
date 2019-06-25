package com.practice.designs;

import java.math.BigDecimal;

public enum Drinks {
	COKE(BigDecimal.valueOf(25)), PEPSI(BigDecimal.valueOf(35)), SODA(BigDecimal.valueOf(45));

	BigDecimal value;

	Drinks(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}
}
