package com.nighthawk.csa.model.SQL.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
