package in.zamo.service.impl;

import in.zamo.mappers.AccountMapper;
import in.zamo.model.Account;
import in.zamo.service.AccountService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public void createAccount(Account account) {
		accountMapper.createAccount(account);
	}

	@Override
	public int deleteAccount(int id) {
		return accountMapper.deleteAccount(id);
	}

	@Override
	public Account findAccountById(int id) {
		return accountMapper.findAccountById(id);
	}

	@Override
	public int findTotal() {
		return accountMapper.findAccountTotal();
	}

	@Override
	public List<Account> findAccountAll() {
		return accountMapper.findAccountAll();
	}

	@Override
	public Account updateAccount(Account account) {
		accountMapper.updateAccount(account);
		return account;	
	}

}
