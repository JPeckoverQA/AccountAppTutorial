package com.qa.app;

import java.util.HashMap;


public class AccountRepositoryMap implements AccountRepository {
	
	//create HashMap
	public HashMap<Integer, Account> map = new HashMap<Integer, Account>();
	

	public void add(Account account) {
		
		map.put(account.getId(), account);
	}
	
	public Account retrieve(Integer id) {
		return map.get(id);
	}

	public Account updateFirstName(int id, String newFirstName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

}
