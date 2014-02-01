/**
 * 
 */
package org.example.guice.model;

import java.io.Serializable;

/**
 * @author horri
 *
 */
public interface IUser extends Serializable {
	String getName();
	void setName(String name);
}
