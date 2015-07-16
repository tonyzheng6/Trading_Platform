package behaviour;

/**
 * Title:           AdministratorInterface.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public interface AdministratorInterface {
	
	public void addUser(UserType userType);
	
	public void deleteUser(int userId);

	public void updatePermissions(int userId, UserType userType);

}