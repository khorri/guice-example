package org.example.guice.module;

import org.example.guice.impl.TechnicalDailyReport;
import org.example.guice.model.IDailyReport;

import com.google.inject.AbstractModule;

public class DailyReportModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IDailyReport.class).to(TechnicalDailyReport.class);

	}

}
