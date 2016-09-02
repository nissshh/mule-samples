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
			@WebParam(name = "WFContext", header = true, partName = "WFContext" , targetNamespace="http://service.wellsfargo.com/entity/message/2007/") WFContextType wfContextType,
			@WebParam(name = "currencyPair") CurrencyPair ccy);
	// @WebParam(name = "WFContext_Response", header = true, partName =
	// "WFContext_Response", mode =
	// Mode.OUT,targetNamespace="http://service.wellsfargo.com/entity/message/2007/")
	// Holder<WFContextType> wfContext_Response);
}
