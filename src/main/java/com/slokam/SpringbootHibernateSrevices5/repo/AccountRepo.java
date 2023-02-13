package com.slokam.SpringbootHibernateSrevices5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.SpringbootHibernateSrevices5.entity.Account;

@Repository
public interface AccountRepo extends  JpaRepository<Account, Integer> {
	
  
	
	
}
