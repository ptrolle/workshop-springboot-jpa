package com.ptrolle.newDateBaseTest.repositories;

import com.ptrolle.newDateBaseTest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
