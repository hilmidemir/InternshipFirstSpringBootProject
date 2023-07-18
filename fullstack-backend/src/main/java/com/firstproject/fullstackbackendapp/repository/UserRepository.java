package com.firstproject.fullstackbackendapp.repository;


import com.firstproject.fullstackbackendapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
