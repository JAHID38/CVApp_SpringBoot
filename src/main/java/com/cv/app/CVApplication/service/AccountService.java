package com.cv.app.CVApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Account;
import com.cv.app.CVApplication.repository.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepo accRepo;
	
	//Registration Service
	public Account createUser(Account ac) {
		return accRepo.save(ac);
	}
	
	public Account fetchUserByUsernameAndPassword(String username, String password) {
		return accRepo.findByUsernameAndPassword(username, password);
	}

	
	public Account findByUsernameAndPassword(String U, String P){
		return accRepo.findByUsernameAndPassword(U, P);
	}
	
	public Account findByUsername(String username) {
		return accRepo.findByUsername(username);
	}

	public Account fetchUserByUsername(String user) {
		// TODO Auto-generated method stub
		return accRepo.findByUsername(user);
	}

	public Account getUserAllInfo(int id) {
		// TODO Auto-generated method stub
		return accRepo.findById(id).orElse(null);
	}

}
