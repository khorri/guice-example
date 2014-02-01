package org.example.guice;

import org.example.guice.module.DailyReportModule;
import org.example.guice.module.HandleExceptionModule;
import org.example.guice.service.DailyReportManager;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new DailyReportModule(),new HandleExceptionModule());
        DailyReportManager reportManager = injector.getInstance(DailyReportManager.class);
        reportManager.createReport();
        reportManager.interceptmethod();
    }
}
