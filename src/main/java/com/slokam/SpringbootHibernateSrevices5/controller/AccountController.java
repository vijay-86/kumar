package com.slokam.SpringbootHibernateSrevices5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.SpringbootHibernateSrevices5.Accountsrevice.IaccountService;
import com.slokam.SpringbootHibernateSrevices5.Accountsrevice.MongoDBservices;
import com.slokam.SpringbootHibernateSrevices5.DTO.AccountDto;
import com.slokam.SpringbootHibernateSrevices5.entity.Account;

@RestController
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	private IaccountService iaccountService;
    
	/*
	 * @PostMapping("save") public ResponseEntity<AccountDto>
	 * saveAccount(@RequestBody AccountDto account){
	 * iaccountService.SaveAccount(account); return ResponseEntity.ok(account);
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	@GetMapping("getall")
	public ResponseEntity<List<Account>> getAll(){
		
	return ResponseEntity.ok(iaccountService.getAll());
	
	}
	
	
	
	
	
	
} 
