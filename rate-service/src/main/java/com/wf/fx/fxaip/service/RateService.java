package com.wf.fx.fxaip.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.wf.fx.fxaip.model.CurrencyPair;
import com.wf.fx.fxaip.model.Rate;

@WebService
public interface RateService {

	@WebMethod(action = "getRate", operationName = "getRate")
	public Rate getRate(
			@WebParam(name = "currencyPair") CurrencyPair ccy);
}
