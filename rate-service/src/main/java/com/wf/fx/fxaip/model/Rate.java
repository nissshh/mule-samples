package com.wf.fx.fxaip.model;

import java.io.Serializable;

public class Rate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8454263161642308848L;

	double rate;

	double inRate;

	public Rate() {
		// TODO Auto-generated constructor stub
	}

	public Rate(double rate, double inRate) {
		super();
		this.rate = rate;
		this.inRate = inRate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getInRate() {
		return inRate;
	}

	public void setInRate(double inRate) {
		this.inRate = inRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(inRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Rate other = (Rate) obj;
		if (Double.doubleToLongBits(inRate) != Double
				.doubleToLongBits(other.inRate))
			return false;
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rate [rate=" + rate + ", inRate=" + inRate + "]";
	}

}
