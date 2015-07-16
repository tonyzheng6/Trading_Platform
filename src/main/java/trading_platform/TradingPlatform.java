package trading_platform;

import java.util.*;

import behaviour.*;

/**
 * Title:           TradingPlatform.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Modified on:     7/13/2015
 * Description:     
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class TradingPlatform {

	private static List<User> userDB = new ArrayList<User>();

	public static List<User> getUserDB() { return userDB; }
	
	public static User findUser(int userId) {
		for(User u:userDB) {
			if(u.getUserId() == userId) {
				return u;
			}
		}
		return null;
	}
}
