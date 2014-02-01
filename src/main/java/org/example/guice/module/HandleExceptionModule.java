package org.example.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class HandleExceptionModule extends AbstractModule {
    @Override
    protected void configure() {
	// this.bind(DailyReportListPanel.class);
	this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(HandleException.class), new HandleExeptionInterceptor());
    }
}