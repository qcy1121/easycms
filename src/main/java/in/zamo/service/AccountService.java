package in.zamo.service;

import in.zamo.model.Account;

import java.util.List;

/**
 * 
 * @author fuxin
 *
 */
public interface AccountService{

	public void createAccount(Account account);
	int deleteAccount(int id);
	
	Account updateAccount(Account account);
	
	public Account findAccountById(int id);
	
	public List<Account> findAccountAll();
	
	public int findTotal();
}