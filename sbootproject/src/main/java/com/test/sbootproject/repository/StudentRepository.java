package com.test.sbootproject.repository;

import com.test.sbootproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByUsernameAndPassword(String username, String password);

    Student findByUsername(String username);
}
