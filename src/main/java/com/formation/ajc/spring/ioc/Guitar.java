package com.formation.ajc.spring.ioc;

import org.springframework.stereotype.Component;

/**
 * 
 */

/**
 * @author AgLounes
 *
 */
@Component("myGuitar")
public class Guitar implements IInstrument {
	public String toString() {
		return "GLINK GLINK GLINK";
		}
}