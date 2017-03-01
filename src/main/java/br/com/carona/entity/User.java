package br.com.carona.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonView;

import br.com.carona.view.View;


@Table(name="Users")
@Entity
public class User {
	private Long id;
	
	
	@JsonView(View.Summary.class)
	private String name;
	
	@JsonView(View.Summary.class)
	private String email;

	@JsonView(View.Summary.class)
	private String password;
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**Name of the user
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**Name of the user
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get user email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set user email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**Password of the user
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**Password of the user
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
