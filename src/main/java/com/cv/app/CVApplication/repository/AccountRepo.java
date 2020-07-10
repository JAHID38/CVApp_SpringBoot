package com.cv.app.CVApplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cv.app.CVApplication.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
	
	public Account findByUsernameAndPassword(String username, String password);


	/*
	 * @Query (value = "SELECT  a.id, a.role FROM account a" +
	 * " WHERE a.username = :username", nativeQuery = true)
	 */
	
	public Account findByUsername(String username);
	
	/*
	 * @Query (value = "SELECT  a.id, a.role FROM account a" +
	 * " WHERE a.username = :username AND a.password=:password", nativeQuery = true)
	 * public Account findByUsernameAndPassword(String username, String password);
	 */
}
