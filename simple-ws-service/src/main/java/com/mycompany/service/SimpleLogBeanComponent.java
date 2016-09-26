package com.mycompany.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleLogBeanComponent {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Object myOperation(Object payload) {
		String payloadS = payload.toString();
		logger.info("Paylaod is {}", payloadS);
		return payload;
	}
}
