/**
 * 
 */
package org.example.guice.impl;

import java.util.Date;

import org.example.guice.model.IDailyReport;

/**
 * @author horri
 *
 */
public class TechnicalDailyReport implements IDailyReport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1317839301346032486L;
	private Date date;
	private String content;

	public Date getDate() {
		if(date==null)
			date = new Date();
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		if(content == null)
			content ="This is a technical report";
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
