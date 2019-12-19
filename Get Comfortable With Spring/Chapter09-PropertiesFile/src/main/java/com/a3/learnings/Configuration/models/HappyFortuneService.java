/**
 * 
 */
package com.a3.learnings.Configuration.models;

import org.springframework.stereotype.Component;

/**
 * @author asinha
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		
		return "Today is your lucky day!!!";
	}

}
