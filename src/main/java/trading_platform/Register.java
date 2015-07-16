package trading_platform;

import behaviour.*;

/**
 * Title:           Register.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Register {
	
	public static void registerUser() {
		new User();
	}
	
	public static void registerUser(String username, String password) {
		new User(username, password);
	}
	
	public static void registerUser(UserType userType) {
		new User(userType);
	}
	
	public static void registerUser(String username, String password, UserType userType) {
		new User(username, password, userType);
	}

}
