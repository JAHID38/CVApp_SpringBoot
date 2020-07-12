package com.cv.app.CVApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cv.app.CVApplication.model.Account;
import com.cv.app.CVApplication.model.Contact;
import com.cv.app.CVApplication.model.Education;
import com.cv.app.CVApplication.model.Language;
import com.cv.app.CVApplication.model.Personal;
import com.cv.app.CVApplication.model.Project;
import com.cv.app.CVApplication.model.Skill;
import com.cv.app.CVApplication.repository.AccountRepo;
import com.cv.app.CVApplication.service.AccountService;
import com.cv.app.CVApplication.service.ContactService;
import com.cv.app.CVApplication.service.EducationService;
import com.cv.app.CVApplication.service.LanguageService;
import com.cv.app.CVApplication.service.PersonalService;
import com.cv.app.CVApplication.service.ProjectService;
import com.cv.app.CVApplication.service.SkillService;

@CrossOrigin(origins = "*")
@RestController
public class AccountController {

	@Autowired
	private AccountService accService;
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private PersonalService personalService;
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private EducationService educationService;
	
	@Autowired
	private LanguageService languageService;
	
	@Autowired
	private SkillService skillService;
	
	@Autowired
	private ProjectService projectService;

	@PostMapping("/userRegister")
	public String registration(@RequestBody Account account) throws Exception {
		String user = account.getUsername();
		if (user != null && !"".equals(user)) {
			Account obj = accService.fetchUserByUsername(user);
			if (obj != null) {
				throw new Exception(user + " is already exist");
			}
		}
		accService.createUser(account);
		return account.getUsername() + " has been registered";
	}

	@PostMapping("/signin")
	public Account loginUser(@RequestBody Account account) throws Exception {
		String user = account.getUsername();
		String pass = account.getPassword();
		Account obj = null;
		if (user != null && pass != null) {
			obj = accService.fetchUserByUsernameAndPassword(user, pass);
		}
		if (obj == null)
			throw new Exception("Invalid Credentials");

		return obj;
	}
	
	@GetMapping("/view/allUser")
	public List<Account> getAllUser(){
		return accountRepo.findAll();
	}

	/*
	 * ***************************************** PERSONAL *****************************************
	 */
	@PostMapping("/register/personal")
	public String createPersonal(@RequestBody Personal personal) throws Exception {
		Integer id = personal.getUserId();
		if (id != null) {
			Personal obj = personalService.getPersonalByUserId(id);
			if (obj != null)
				throw new Exception("Data already exists");
		}
		personalService.createPersonal(personal);
		return "Personal Deatils of " + personal.getFirstName() + " " + personal.getLastName()
				+ " has been added successfully";
	}

	@PostMapping("/view/userProfile")
	public Personal getPersonal(@RequestBody Personal account) throws Exception {

		Integer userId = account.getUserId();
		Personal obj = null;

		obj = personalService.getPersonalByUserId(userId);

		return obj;
	}
	
	/*
	 * ***************************************** CONTACT *****************************************
	 */
	
	@PostMapping("/register/contact")
	public String createContact(@RequestBody Contact contact) throws Exception {
		Integer id = contact.getUserId();
		if (id != null) {
			Contact obj = contactService.getContactByUserId(id);
			if (obj != null)
				throw new Exception("Data already exists");
		}
		contactService.createContact(contact);
		return "Contact details is added";
	}
	
	@PostMapping("/view/userContact")
	public Contact getContact(@RequestBody Contact account) throws Exception {

		Integer userId = account.getUserId();
		Contact obj = null;

		obj = contactService.getContactByUserId(userId);

		return obj;
	}
	
	/*
	 * ***************************************** EDUCATION *****************************************
	 */
	@PostMapping("/register/education")
	public String createEducation(@RequestBody Education education) throws Exception {
		Integer id = education.getUserId();
		String degree = education.getDegree();
		if (degree != null) {
			Education obj = educationService.getEducationByUserIdAndDegree(id, degree);
			if (obj != null)
				throw new Exception("Data already exists");
		}
		educationService.createEducation(education);
		return education.getDegree() + " in " + education.getMajor()
				+ " has been added successfully";
	}
	
	@GetMapping("/{userId}/view/education")
	public List<Education> retrieveEducation (@PathVariable int userId){
		return educationService.getEducationByUserId(userId);
	}

	/*
	 * ***************************************** LANGUAGE *****************************************
	 */
	@PostMapping("/register/language")
	public String createLanguage(@RequestBody Language language) throws Exception {
		Integer id = language.getUserId();
		String lang = language.getLanguage();
		if (lang != null) {
			Language obj = languageService.getLanguageByUserIdAndLanguage(id, lang);
			if (obj != null)
				throw new Exception("Data already exists");
		}
		languageService.createLanguage(language);
		return "Language: " +language.getLanguage() + " has been added successfully";
	}
	
	@GetMapping("/{userId}/view/language")
	public List<Language> retrieveLanguage (@PathVariable int userId){
		return languageService.getLanguageByUserId(userId);
	}
	
	/*
	 * ***************************************** SKILL *****************************************
	 */
	@PostMapping("/register/skill")
	public String createSkill(@RequestBody Skill skill) throws Exception {
		Integer id = skill.getUserId();
		String s = skill.getSkill();
		if (s != null) {
			Skill obj = skillService.getSkillByUserIdAndSkill(id, s);
			if (obj != null)
				throw new Exception("Data already exists");
		}
		skillService.createSkill(skill);
		return "Skill: " +skill.getSkill() +" has been added successfully";
	}
	
	@GetMapping("/{userId}/view/skill")
	public List<Skill> retrieveSkill (@PathVariable int userId){
		return skillService.getSkillByUserId(userId);
	}
	
	/*
	 * ***************************************** PROJECT *****************************************
	 */
	
	@PostMapping("/register/project")
	public String createProjects(@RequestBody Project project) throws Exception {
		Integer id = project.getUserId();
		String proj = project.getProjectName();
		if (proj != null) {
			Project obj = projectService.getProjectByUserIdAndProjectName(id, proj);
			if (obj != null)
				throw new Exception("Data already exists");
		}
		projectService.createProject(project);
		return "Project: " +project.getProjectName() +" has been added successfully";
	}
	
	@GetMapping("/{userId}/view/project")
	public List<Project> retrieveProject (@PathVariable int userId){
		return projectService.getProjectByUserId(userId);
	}
}
