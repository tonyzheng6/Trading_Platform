package trading_platform;

import behaviour.*;

/**
 * Title:           Login.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Login {
	
	public static boolean verify(User user, String password) {
		if(user.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
}
