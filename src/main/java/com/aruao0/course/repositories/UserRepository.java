package com.aruao0.course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aruao0.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
