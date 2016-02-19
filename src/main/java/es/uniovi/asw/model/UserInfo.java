package es.uniovi.asw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "user")
public class UserInfo extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(UserInfo.class);

       	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String nif;

        @Column(nullable = false)
	private int codigo_mesa;
	
	@Column(nullable = false)
	private String password;

	public UserInfo(String email, String password) {
		log.info("Creating user " + email + ". password: " + password);
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNif() {
		return nif;
	}
	
	public int getCodigoMesa() {
		return codigo_mesa;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public void setCodigoMesa(int codigo) {
		this.codigo_mesa = codigo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean emailCorrecto() {
		if (email != null)
			if (email.contains("@") && !email.startsWith("@") && !email.endsWith("@"))
				return true;
		return false;
	}

}
