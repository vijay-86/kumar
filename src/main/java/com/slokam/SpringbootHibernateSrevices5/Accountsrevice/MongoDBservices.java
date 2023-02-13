package com.slokam.SpringbootHibernateSrevices5.Accountsrevice;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.slokam.SpringbootHibernateSrevices5.DTO.AccountDto;
import com.slokam.SpringbootHibernateSrevices5.entity.Account;

//@Service
//@Primary
public class MongoDBservices implements IaccountService  {


	
	  @Override public AccountDto SaveAccount(AccountDto account) {
	  
	  return account; }
	 
	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto findAccountById(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
