package com.qa.accountTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.AccountRepositoryMap;

public class accountTest {
	
	@BeforeClass
	public static void initial() {
		System.out.println("Start report");
	}
	
	@Before
	public void setup() {
		System.out.println("Begin Test");
	}
	
	
	@Test
	public void createAccount() {
		Account account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNumber(3);
		
		int id = account.getId();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		int accountNumber = account.getAccountNumber();
		
		//should really be 4 different tests. See below
		assertEquals("incorrect id", 0, id);
		assertEquals("incorrect first name", "Chris", firstName);
		assertEquals("incorrect last name", "Perrins", lastName);
		assertEquals("incorrect account number", 3, accountNumber);
	
	}
	@Test
	public void createAccountId() {
		Account account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNumber(3);
		
		int id = account.getId();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		int accountNumber = account.getAccountNumber();
		
		assertEquals("incorrect id", 0, id);
	}
	@Test
	public void createAccountFirstName() {
		Account account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNumber(3);
		
		int id = account.getId();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		int accountNumber = account.getAccountNumber();
		
		assertEquals("incorrect first name", "Chris", firstName);
	}
	
	@Test
	public void createLastName() {
		Account account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNumber(3);
		
		int id = account.getId();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		int accountNumber = account.getAccountNumber();
		
		assertEquals("incorrect last name", "Perrins", lastName);
		
	}
	
	@Test
	public void createAccountAccountNumber() {
		Account account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNumber(3);
		
		int id = account.getId();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		int accountNumber = account.getAccountNumber();
		
		assertEquals("incorrect account number", 3, accountNumber);
	}
	
	//creates a repository class. adds and retrieves accounts. does this with a java map - hash map
	
	@Test
	public void accountRepositoryMapTest() {
		AccountRepositoryMap arm = new AccountRepositoryMap();
		Account a = new Account();
		int id = 2;
		a.setId(id);
		a.setFirstName("Chris");
		arm.add(a);
		Account retrieved = arm.retrieve(id);
		assertEquals("Wrong account retrieved", "Chris", retrieved.getFirstName());
		//alternative
		assertEquals("Wrong account retrieved", a, retrieved);
	}
	



}
