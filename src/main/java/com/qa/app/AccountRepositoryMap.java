package com.qa.app;

import java.util.HashMap;

<<<<<<< HEAD
public class AccountRepositoryMap {
=======
public class AccountRepositoryMap implements AccountRepository {
>>>>>>> a3ac4692210a832df4e422061e929bb1113b7458
	
	//create HashMap
	public HashMap<Integer, Account> map = new HashMap<Integer, Account>();
	
<<<<<<< HEAD
	
	//add and retrieve should really be in a separate class Account Repository
	
	
=======
>>>>>>> a3ac4692210a832df4e422061e929bb1113b7458
	public void add(Account account) {
		
		map.put(account.getId(), account);
	}
	
	public Account retrieve(Integer id) {
		return map.get(id);
	}

}
