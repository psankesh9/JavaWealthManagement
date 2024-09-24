package com.yourapp.wealthmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yourapp.wealthmanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
