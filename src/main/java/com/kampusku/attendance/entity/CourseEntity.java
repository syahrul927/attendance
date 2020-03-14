package com.kampusku.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course", uniqueConstraints = @UniqueConstraint(columnNames = "code"))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@NotBlank
	@Column(name = "code")
	private String code;
	
	@NotBlank
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "desc")
	private String desc;
	
	@NotBlank
	@Column(name = "semester")
	private Integer semester;
}
