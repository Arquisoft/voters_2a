package es.uniovi.asw.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import es.uniovi.asw.model.UserInfo;

@Service
@Transactional
public class UserService {

	public UserService() {

	}

	public boolean validar(UserInfo user) {

		return false;
	}

}
