package es.uniovi.asw.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uniovi.asw.model.UserInfo;
import es.uniovi.asw.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl() {

	}

	public boolean validar(UserInfo user) {
		UserInfo u = this.userRepository.findByEmail(user.getEmail());

		if (u == null) {
			return false;
		}

		if (u.getPassword().equals(user.getPassword())) {
			return true;
		}
		return false;
	}

}
