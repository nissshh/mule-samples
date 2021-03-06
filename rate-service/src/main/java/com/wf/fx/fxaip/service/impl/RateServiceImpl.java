package com.wf.fx.fxaip.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.apache.log4j.Logger;

import com.wf.fx.fxaip.model.CurrencyPair;
import com.wf.fx.fxaip.model.Rate;
import com.wf.fx.fxaip.service.RateService;

public class RateServiceImpl implements RateService {

	private static Logger logger = Logger.getLogger(RateServiceImpl.class);

	public static Map<CurrencyPair, Rate> ratesMap = new HashMap<CurrencyPair, Rate>();

	static {
		ratesMap.put(new CurrencyPair("USD", "EUR"), new Rate(0.73649, 1.35778));
		ratesMap.put(new CurrencyPair("USD", "GBP"), new Rate(0.62176, 1.60834));
		ratesMap.put(new CurrencyPair("USD", "INR"), new Rate(61.8672, 0.01616));
		ratesMap.put(new CurrencyPair("EUR", "USD"), new Rate(1.35778, 0.73649));
		ratesMap.put(new CurrencyPair("EUR", "GBP"), new Rate(0.84415, 1.18462));
		ratesMap.put(new CurrencyPair("EUR", "INR"), new Rate(84.0870, 0.01189));
		ratesMap.put(new CurrencyPair("GBP", "EUR"), new Rate(1.18462, 0.84415));
		ratesMap.put(new CurrencyPair("GBP", "USD"), new Rate(1.60834, 0.62176));
		ratesMap.put(new CurrencyPair("GBP", "INR"), new Rate(99.6219, 0.01004));
	}

	public Rate getRate(CurrencyPair ccy) {
		Rate rate = ratesMap.get(ccy);
		logger.info("Sending Rate - " + rate.getRate());
		return rate;
	}

	public Map<CurrencyPair, Rate> getRatesMap() {
		return ratesMap;
	}

	@Override
	public Rate updateRate(CurrencyPair ccyPair, Rate rate) {
		ratesMap.put(ccyPair,rate);
		return rate;
	}

	@Override
	public Rate createRate(CurrencyPair ccyPair, Rate rate) {
		ratesMap.put(ccyPair,rate);
		return rate;
	}

}
