package com.kampusku.attendance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kampusku.attendance.constanta.RoleName;
import com.kampusku.attendance.entity.RoleEntity;

@Repository
public interface RolesRepository extends JpaRepository<RoleEntity, Long> {
	Optional<RoleEntity> findByName(RoleName name);

}
