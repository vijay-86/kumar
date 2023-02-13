package com.slokam.SpringbootHibernateSrevices5.Mapstr;

import java.util.List;

import javax.xml.transform.Source;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.slokam.SpringbootHibernateSrevices5.DTO.AccountDto;
import com.slokam.SpringbootHibernateSrevices5.entity.Account;

@Mapper
public interface IAccountMapper {
	
	
	 @Mappings({
	  
	  @Mapping( source   ="accountID", target="aid"),
	  
	  @Mapping( source ="accountName", target="aname"),
	  
	  @Mapping( source ="accountPhone", target="aphone"),
	  
	  @Mapping( source ="accountNum", target="anum"), })
	  public Account AccountDtoToaccount(AccountDto accountdto);
	 

	@Mappings({
		@Mapping( source ="aid", target="accountID"),
		@Mapping( source ="aname", target="accountName"),
		@Mapping( source ="anum", target="accountNum")})
		@Mapping( source ="aphone", target="accountPhone")
		
	
	public List<AccountDto> AccountToAccountDto(List<Account> acct);
	
	   public AccountDto accountToaccountDto(Account account);
	
}
