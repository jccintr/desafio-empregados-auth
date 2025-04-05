package com.devsuperior.demo.dto;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.demo.entities.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDTO {
	
	private Long id;
	@NotBlank(message = "Campo requerido")
	@Size(min = 3, message = "O campo deve ter pelo menos 3 caracteres")
	private String firstName;
	@NotBlank(message = "Campo requerido")
	@Size(min = 3, message = "O campo deve ter pelo menos 3 caracteres")
	private String lastName;
	@NotBlank(message = "Campo requerido")
	@Email(message="Email inválido",regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	private Set<RoleDTO> roles = new HashSet<>();
	
	public UserDTO() {
		
	}
	
	public UserDTO(Long id, String firstName, String lastName, String email) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}



	public UserDTO(User entity) {
		
		this.id = entity.getId();
		this.firstName = entity.getFirstName();
		this.lastName = entity.getLastName();
		this.email = entity.getEmail();
		entity.getRoles().forEach(role->this.roles.add(new RoleDTO(role)));
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
	
	
	
	

}
