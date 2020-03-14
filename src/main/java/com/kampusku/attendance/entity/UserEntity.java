package com.kampusku.attendance.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(max = 20, min = 8)
	private String username;
	@Size(min = 8)
	private String password;
	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles",joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<RoleEntity> roles = new HashSet<>();
}
