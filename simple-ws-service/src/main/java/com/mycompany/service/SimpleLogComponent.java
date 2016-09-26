package com.mycompany.service;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLogComponent implements Callable {

	private Logger logger = LoggerFactory.getLogger(getClass()); 
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		Object payload = eventContext.getMessage().getPayload(); // Not a good practice
		logger.debug(payload.getClass().getName());
		String payloadS = eventContext.getMessage().getPayloadAsString();
		logger.info("Paylaod is {}",payloadS);
		return payload;
	}

}
