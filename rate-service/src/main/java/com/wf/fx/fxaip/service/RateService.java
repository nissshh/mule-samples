package com.wf.fx.fxaip.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.wf.fx.fxaip.model.CurrencyPair;
import com.wf.fx.fxaip.model.Rate;

@WebService
public interface RateService {

	@WebMethod(action = "getRate", operationName = "getRate")
	public Rate getRate(@WebParam(name = "currencyPair") CurrencyPair ccy);

	// TBD
	@WebMethod(action = "upadateRate", operationName = "updateRate")
	public Rate updateRate(@WebParam(name = "currencyPair") CurrencyPair ccyPair, @WebParam(name = "rate") Rate rate);

	@WebMethod(action = "createRate", operationName = "createRate")
	public Rate createRate(@WebParam(name = "currencyPair") CurrencyPair ccyPair, @WebParam(name = "rate") Rate rate);
}
