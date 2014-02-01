/**
 * 
 */
package org.example.guice.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author horri
 *
 */
public interface IDailyReport extends Serializable {
	Date getDate();
	void setDate(Date d);
	String getContent();
	void setContent(String c);
}
