package com.kampusku.attendance.auditing;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@MappedSuperclass
@JsonIgnoreProperties(
		value = {"createdBy", "updatedBy"},
		allowGetters = true
)
@Data
public abstract class UserDateAudit {
	
	@CreatedBy
	@Column(updatable = false)
	private long createdBy;
	
	@LastModifiedBy
	private long modifiedBy;

}
