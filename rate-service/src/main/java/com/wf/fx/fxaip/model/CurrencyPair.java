package com.wf.fx.fxaip.model;

import java.io.Serializable;

public class CurrencyPair implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4928204666672275859L;
	private String nume;
	private String deno;

	public CurrencyPair() {
		// TODO Auto-generated constructor stub
	}
	public CurrencyPair(String deno, String nume) {
		super();
		this.deno = deno;
			this.nume = nume;
	}

	public String getDeno() {
		return deno;
	}

	public void setDeno(String deno) {
		this.deno = deno;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deno == null) ? 0 : deno.hashCode());
		result = prime * result + ((nume == null) ? 0 : nume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrencyPair other = (CurrencyPair) obj;
		if (deno == null) {
			if (other.deno != null)
				return false;
		} else if (!deno.equals(other.deno))
			return false;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurrenyPair [deno=" + deno + ", nume=" + nume + "]";
	}

}
