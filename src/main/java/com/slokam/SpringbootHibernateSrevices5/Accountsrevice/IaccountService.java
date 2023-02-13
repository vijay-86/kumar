package com.slokam.SpringbootHibernateSrevices5.Accountsrevice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.slokam.SpringbootHibernateSrevices5.DTO.AccountDto;
import com.slokam.SpringbootHibernateSrevices5.entity.Account;

@Service
public interface IaccountService {

	
	
	public AccountDto SaveAccount(AccountDto account);
	public List<Account> getAll();
	
	public AccountDto findAccountById(Integer id);
	
	
}
