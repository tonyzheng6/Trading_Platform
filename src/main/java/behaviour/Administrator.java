package behaviour;

import org.apache.log4j.Logger;

import trading_platform.*;

/**
 * Title:           Administrator.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Administrator extends Behaviour implements AdministratorInterface {
	
	private Logger log = Logger.getLogger(Administrator.class);
	
	public void addUser(UserType userType) {
		TradingPlatform.getUserDB().add(new User(userType));
	}
	
	public void deleteUser(int userId) {
		for(User u:TradingPlatform.getUserDB()) {
			if(u.getUserId() == userId) {
				TradingPlatform.getUserDB().remove(u);
			}
		}
	}
	
	public void updatePermissions(int userId, UserType userType) {
		
		for(User u:TradingPlatform.getUserDB()) {
			if(u.getUserId() == userId) {
				log.info("Updated User with ID: " + userId);
				log.info("Changed user permission from " + u.getBehaviour().getClass().getSimpleName() + " to " + userType);
				u.updatePermissions(userType);
			}
		}
	}
}
