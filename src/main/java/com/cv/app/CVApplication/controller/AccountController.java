package com.cv.app.CVApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cv.app.CVApplication.model.Account;
import com.cv.app.CVApplication.model.Personal;
import com.cv.app.CVApplication.service.AccountService;
import com.cv.app.CVApplication.service.PersonalService;

@CrossOrigin (origins = "*")
@RestController
public class AccountController {
	
	@Autowired
	private AccountService accService;
	
	@Autowired
	private PersonalService personalService;
	
	@PostMapping("/userRegister")
	public String registration(@RequestBody Account account) throws Exception {
		String user = account.getUsername();
		if (user != null &&  !"".equals(user)) {
			Account obj = accService.fetchUserByUsername(user);
			if (obj != null) {
				throw new Exception (user +" is already exist");
			}
		}
		 accService.createUser(account);
		return account.getUsername() +" has been registered";
	}
	
	@PostMapping("/signin")
	public Account loginUser(@RequestBody Account account) throws Exception {
		String user = account.getUsername();
		String pass = account.getPassword();
		Account obj = null;
		if (user != null && pass != null) {
			obj = accService.fetchUserByUsernameAndPassword(user, pass);
		}
		if(obj == null)
			throw new Exception ("Invalid Credentials");
		
		return obj;
	}
	
	@PostMapping("/register/personal")
	public String createPersonal (@RequestBody Personal personal) throws Exception{
		Integer id = personal.getUserId();
		if (id != null) {
			Personal obj = personalService.getPersonalByUserId(id);
			if(obj != null)
				throw new Exception("Data already exists");
		}
		personalService.createPersonal(personal);
		return "Personal Deatils of "+ personal.getFirstName()+" "+personal.getLastName()
		+ " has been added successfully";
	}
	
	/*
	 * @GetMapping("{id}/view/userProfile") public Account getPersonal(@PathVariable
	 * int id) { return accService.getUserAllInfo(id); }
	 */
	
	/*
	 * @GetMapping("{id}/view/userProfile") public Personal
	 * getPersonalByUserId(@PathVariable("userId") int userId) { return
	 * personalService.getPersonalByUserId(userId); }
	 */
	
	@PostMapping("/view/userProfile")
	public Personal getPersonal(@RequestBody Personal account) throws Exception {
		
		Integer userId = account.getUserId();
		Personal obj = null;

			obj = personalService.getPersonalByUserId(userId);
		

		return obj;
	}

}
