package behaviour;

import org.apache.log4j.Logger;

import trading_platform.*;

/**
 * Title:           User.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class User {

	private final int userId;
	private static int counter = 0;
	private String username, password;
	private boolean guest, admin, broker, shareholder, brokeholder;
	private Behaviour behaviour;
	
	private static Logger log = Logger.getLogger(User.class);

	public User() { 
		this.userId = counter+=1;
		TradingPlatform.getUserDB().add(this);
		log.info("New user created with ID: " + userId);
	}
	
	public User(String username, String password) { 
		TradingPlatform.getUserDB().add(this);
		this.userId = counter+=1; 
		this.username = username;
		this.password = password;
		log.info("New user created with ID: " + userId);
	}
	
	public User(UserType userType) { 
		TradingPlatform.getUserDB().add(this);
		this.userId = counter+=1; 
		updatePermissions(userType);
		log.info("New user created with ID: " + userId);
	}
	
	public User(String username, String password, UserType userType) { 
		TradingPlatform.getUserDB().add(this);
		this.userId = counter+=1; 
		this.username = username;
		this.password = password;
		updatePermissions(userType);
		log.info("New user created with ID: " + userId);
	}
	
	public int getUserId() { return userId; }
	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	public boolean isGuest() { return guest; }
	public void setGuest(boolean guest) { this.guest = guest; }
	public boolean isAdmin() { return admin; }
	public void setAdmin(boolean admin) { this.admin = admin; }
	public boolean isBroker() { return broker; }
	public void setBroker(boolean broker) { this.broker = broker; }
	public boolean isShareholder() { return shareholder; }
	public void setShareholder(boolean shareholder) { this.shareholder = shareholder; }
	public boolean isBrokeholder() { return brokeholder; }
	public void setBrokeholder(boolean brokeholder) { this.brokeholder = brokeholder; }
	public Behaviour getBehaviour() { return behaviour; }
	public void setBehaviour(Behaviour behaviour) { this.behaviour = behaviour; }
	
	public void updatePermissions(UserType userType) {
		if(userType == UserType.GUEST) {
			this.guest = true;
			this.admin = false;
			this.broker = false;
			this.shareholder = false;
			this.behaviour = new Guest();
		}
		else if(userType == UserType.ADMINISTRATOR) {
			this.guest = false;
			this.admin = true;
			this.broker = false;
			this.shareholder = false;
			this.behaviour = new Administrator();
		}
		else if(userType == UserType.BROKER) {
			this.guest = false;
			this.admin = false;
			this.broker = true;
			this.shareholder = false;
			this.behaviour = new Broker();
		}
		else if(userType == UserType.SHAREHOLDER) {
			this.guest = false;
			this.admin = false;
			this.broker = false;
			this.shareholder = true;
			this.behaviour = new Shareholder();
		}
		else if(userType == UserType.BROKEHOLDER) {
			this.guest = false;
			this.admin = false;
			this.broker = true;
			this.shareholder = true;
			this.behaviour = new Brokeholder();
		}
	}
}