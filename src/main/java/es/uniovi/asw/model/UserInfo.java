package es.uniovi.asw.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserInfo {

	private static final Logger log = LoggerFactory.getLogger(UserInfo.class);

	private String email;
	private String password;

	public UserInfo() {

	}

	public UserInfo(String email, String password) {
		log.info("Creating user " + email + ". password: " + password);
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}