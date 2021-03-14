package unittesing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount account;
	private static int count;
	
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This executes before any test cases. Count = " + count++);
	}
	
	@Before
	public void setup() {
		account = new BankAccount("Panos", "Mast", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test...");
	}

	@Test
	public void testDeposit() {
		double balance = account.deposit(200.00, true);
		assertEquals(1200, balance, 0); // delta parameter
	}

	@Test
	public void testWithdraw_branch() {
		double balance = account.withdraw(600, true);
		assertEquals(400.00, balance, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw_notBranch() {
		account.withdraw(600, false);
		fail("Should have thrown IllegalArgumentException");
	}

	@Test
	public void testGetBalance_deposit() {
		double balance = account.deposit(200.00, true);
		assertEquals(1200, account.getBalance(), 0); // delta parameter
	}
	
	@Test
	public void testGetBalance_withdraw() {
		double balance = account.withdraw(200.00, true);
		assertEquals(800, account.getBalance(), 0); // delta parameter
	}

	@Test
	public void isChecking_true() {
//		assertEquals(true, account.isChecking());
		assertTrue("The account is not a checking accout", account.isChecking());
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This executes after any test cases. Count = " + count++);
	}
	
	@After
	public void teardown() {
		System.out.println("Count = " + count++);
	}
}
