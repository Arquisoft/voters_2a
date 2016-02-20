package es.uniovi.asw.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class UserInfoTest {

	@Test
	public void createUser() throws Exception {
		UserInfo user = new UserInfo(null, "1");
		assertFalse(user.emailCorrecto(user.getEmail()));
		assertTrue(user.getPassword().equals("1"));
		user.setEmail("@.com");
		assertFalse(user.emailCorrecto(user.getEmail()));
		user.setEmail("a@");
		assertFalse(user.emailCorrecto(user.getEmail()));
		user.setEmail("a@a.com");
		assertTrue(user.emailCorrecto(user.getEmail()));
		assertFalse(user.getPassword().equals(null));
		user.setPassword("123456");
		assertTrue(user.passwordCorrecta(user.getPassword()));
		user.setEmail("");
		assertFalse(user.getEmail().equals(""));
		user.setNif("");
		assertFalse(user.nifCorrecto(user.getNif()));
		
	}

}
