package br.com.agilebr.code;

import java.math.BigDecimal;

public class OperadoraAmerica implements Operadora {

	@Override
	public BigDecimal getTaxaPagamento() {
		return new BigDecimal("8.0");
	}

	@Override
	public String getBandeira() {
		return "A";
	}
}
