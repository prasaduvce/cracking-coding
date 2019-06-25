package com.practice.designs;

import java.math.BigDecimal;

public class Coin {
	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public Coin(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Coin{" +
			   "amount=" + amount +
			   '}';
	}
}
