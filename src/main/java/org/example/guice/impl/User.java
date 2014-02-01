/**
 * 
 */
package org.example.guice.impl;

import org.example.guice.model.IUser;

/**
 * @author horri
 * 
 */
public class User implements IUser {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3241514043904841193L;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
