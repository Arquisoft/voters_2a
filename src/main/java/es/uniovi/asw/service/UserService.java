package es.uniovi.asw.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uniovi.asw.model.UserInfo;
import es.uniovi.asw.repository.UserRepository;

@Service
@Transactional
public class UserService {


	public UserService() {

	}

	public boolean validar(UserInfo user) {
	
		return false;
	}

}
