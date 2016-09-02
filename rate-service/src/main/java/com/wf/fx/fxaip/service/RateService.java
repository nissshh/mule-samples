package com.wf.fx.fxaip.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.xml.ws.Holder;

import com.wellsfargo.launchpad.wfxml.WFContext;
import com.wellsfargo.service.entity.message._2007.WFContextType;
import com.wf.fx.fxaip.model.CurrencyPair;
import com.wf.fx.fxaip.model.Rate;

@WebService
public interface RateService {

	@WebMethod(action = "getRate", operationName = "getRate")
	public Rate getRate(
			@WebParam(name = "currencyPair") CurrencyPair ccy);
}
