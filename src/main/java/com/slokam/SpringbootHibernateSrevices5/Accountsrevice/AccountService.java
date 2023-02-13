package com.slokam.SpringbootHibernateSrevices5.Accountsrevice;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.SpringbootHibernateSrevices5.DTO.AccountDto;
import com.slokam.SpringbootHibernateSrevices5.Mapstr.IAccountMapper;
import com.slokam.SpringbootHibernateSrevices5.entity.Account;
import com.slokam.SpringbootHibernateSrevices5.repo.AccountRepo;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class AccountService implements IaccountService{

	@Autowired
	private AccountRepo repo;
	
	 IAccountMapper mapper= Mappers.getMapper(IAccountMapper.class);
  
	
	@Override
	public AccountDto SaveAccount(AccountDto account) {
		//Account a= new Account(account.getAid(),account.getAname(),account.getAphone(),account.getAnum());
		 Account acct= mapper.AccountDtoToaccount(account);
		
		repo.save(acct);
		return account;
	}


	@Override
	public List<Account> getAll() {
		
		
	List<Account> list=	repo.findAll();
	 //log.info(""+list);
		 List<AccountDto> dto=mapper.AccountToAccountDto(list);
	//log.info(""+dto)	; 
	return list;
	
	}


	@Override
	public AccountDto findAccountById(Integer id) {
	
	Optional<Account> acct=	repo.findById(id);
	
	
	if(acct.isPresent()) {
		
		mapper.AccountDtoToaccount(acct.get());
	}
		
		
		return null;
	}


	


	


	

	
	
	
	

	
}
