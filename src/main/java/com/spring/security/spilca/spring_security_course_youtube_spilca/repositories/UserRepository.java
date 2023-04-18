package com.spring.security.spilca.spring_security_course_youtube_spilca.repositories;

import com.spring.security.spilca.spring_security_course_youtube_spilca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("""
            SELECT u FROM User u WHERE u.username = :username
            """)
    Optional<User> findUsersByUserName(String username);
}
