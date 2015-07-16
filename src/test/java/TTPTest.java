import org.junit.*;
import static org.junit.Assert.*;

import org.apache.log4j.PropertyConfigurator;

import behaviour.*;
import trading_platform.*;

/**
 * Title:           .java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class TTPTest {

	private static User admin;
	private static User user;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		admin = new User(UserType.ADMINISTRATOR);
		user = new User(UserType.GUEST);	
	}

	@Before
	public void setUp() throws Exception {
		 
	}

	@Test
	public void test1() {
		assertEquals(admin.getUserId(), 1);
	}

	@Test
	public void test2() {
		assertEquals(user.getUserId(), 2);
	}

	@Test
	public void test3() {
		assertTrue(user.isGuest());
	}
	
	@Test
	public void test4() {
		assertTrue(!user.isAdmin());	
	}
	
	@Test
	public void test5() {
		assertTrue(!user.isBroker());	
	}
	
	@Test
	public void test6() {
		assertTrue(!user.isShareholder());	
	}

	@Test
	public void test7() {
		if(admin.getBehaviour() instanceof Administrator) {
			((Administrator)admin.getBehaviour()).updatePermissions(2, UserType.BROKER);
		}

		assertTrue(!user.isGuest());
	}

	@Test
	public void test8() {
		assertTrue(!user.isAdmin());
	}

	@Test
	public void test9() {
		assertTrue(user.isBroker());
	}

	@Test
	public void test10() {
		assertTrue(!user.isShareholder());
	}
	
	@Test
	public void test11() {
		assertTrue(!user.isShareholder());
	}
	
	@Test
	public void test12() {
		user.setPassword("Password123");
		assertTrue(Login.verify(user, "Password123"));
	}
	
	@Test
	public void test13() {
		assertTrue(!Login.verify(user, "Password124"));
	}
	
	@Test
	public void test14() {
		assertEquals(2, TradingPlatform.getUserDB().size(), 0.0);
	}
	
	@Test
	public void test15() {
		Register.registerUser();
		assertEquals(3, TradingPlatform.getUserDB().size(), 0.0);
	}
	
	@Test
	public void test16() {
		Register.registerUser("John Black", "Password1234", UserType.SHAREHOLDER);
		assertEquals(4, TradingPlatform.getUserDB().size(), 0.0);
	}
	
	@Test
	public void test17() {
		assertTrue(Login.verify(TradingPlatform.getUserDB().get(TradingPlatform.getUserDB().size()-1), "Password1234"));
	}
	
	@Test
	public void test18() {
		assertTrue(Login.verify(TradingPlatform.findUser(4), "Password1234"));
	}
}
