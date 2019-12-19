/**
 * 
 */
package com.a3.learnings.autowiring.models;

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
