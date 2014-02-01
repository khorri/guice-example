package org.example.guice.module;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class HandleExeptionInterceptor implements MethodInterceptor {
    // @Inject
    // private DailyReportListPanel dailyReportListPanel;
    private final static Logger log = Logger.getLogger(HandleExeptionInterceptor.class);

    public Object invoke(MethodInvocation invocation) throws Throwable {
	Object result = null;
	log.info("The Guice method interception");
	try {
	    result = invocation.proceed();
	} catch (Exception e) {
	    log.error(e.getMessage(), e);
	}

	return result;
    }
}