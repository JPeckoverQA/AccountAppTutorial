package com.qa.app;

public interface AccountRepository {
	
	public void add(Account account); 
		
		

	
	public Account retrieve(Integer id); 
		
		
	Account updateFirstName(int id, String newFirstName);
		
	void remove(int id);


}
