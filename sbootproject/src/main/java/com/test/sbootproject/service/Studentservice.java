package com.test.sbootproject.service;

import com.test.sbootproject.dto.LoginRequest;
import com.test.sbootproject.entity.Student;

import java.util.List;

public interface Studentservice {
    boolean login(LoginRequest loginRequest);

    Student save(Student student);

    Student searchById(int id);

    List<Student> getStudents();

    Student updatestudent(Student student);

    void deletestudent(int id);


}
