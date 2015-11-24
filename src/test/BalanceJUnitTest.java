package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Balance;

public class BalanceJUnitTest{

	@Test
	//Check of negative balance.
	public void WithdrawTest() {
		Balance Balance = new Balance(30000);
		Balance.withdraw(40000);
		int result = Balance.getBalance();
		assertEquals(0, result);
	}
	
	@Test
	//Checks for the deposit method works.
	public void DepositTest() {
		Balance Balance = new Balance(30000);
		Balance.deposit(10000);
		int result = Balance.getBalance();
		assertEquals(40000, result);
	}

	@Test
	//Checks if it is possible to deposit a negative value.
	public void DepositNegativeValueTest() {
		Balance Balance = new Balance(30000);
		Balance.deposit(-1000);
		int result = Balance.getBalance();
		assertEquals(30000, result);
	}

	@Test
	// Checks if it possible to withdraw a negative value.
	public void WithdrawNegativeValuetest() {
		Balance Balance = new Balance(30000);
		Balance.withdraw(-2000);
		int result = Balance.getBalance();
		assertEquals(30000, result);
	}


}
