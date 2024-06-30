package com.shiham.interceptors;

import java.util.logging.Logger;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggingInterceptor {

	@Inject
	private Logger logger;

	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {

		// System.out.println("> Entry : " + ic.getMethod());

		logger.info(String.format("Entry %s" , ic.getMethod()));
		return ic.proceed();
	}

}
