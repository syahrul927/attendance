package com.kampusku.attendance.entity;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

import com.kampusku.attendance.constanta.RoleName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity { 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;
}
