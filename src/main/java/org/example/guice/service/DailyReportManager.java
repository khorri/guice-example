/**
 * 
 */
package org.example.guice.service;

import java.io.Serializable;

import javax.inject.Inject;

import org.example.guice.model.IDailyReport;
import org.example.guice.model.IUser;
import org.example.guice.module.HandleException;
import org.junit.experimental.theories.Theory;

/**
 * @author horri
 *
 */
public class DailyReportManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2533568079721356848L;
	
	
	private IDailyReport report;
	
	
	@Inject
	public DailyReportManager(IDailyReport report) {
		this.report = report;
	}



	public void createReport(){
		System.out.println("Create new report ");
		System.out.println("ReportDate : "+report.getDate());
		System.out.println("Report Content : "+report.getContent());
	}
	@HandleException
	public void interceptmethod(){
		throw new RuntimeException("Exception throws when intercepting the method");
	}
	

}
