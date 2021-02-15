package com.test.sbootproject.service;

import com.test.sbootproject.dto.LoginRequest;
import com.test.sbootproject.entity.Student;
import com.test.sbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceimpl implements Studentservice {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public boolean login(LoginRequest loginRequest) {
        Student student = studentRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if (student == null) {
            return false;
        }
        return true;
    }
    @Override
    public Student save(Student student){
        Student responseStudent = studentRepository.save(student);
        Optional<Student> student1= studentRepository.findById(1);
        if (student1.isPresent()){
            return student1.get();
        }

        return null;
    }

    @Override
    public Student searchById(int id) {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        studentRepository.findAll();
        return null;
    }

    @Override
    public Student updatestudent(Student student) {
        Student s = studentRepository.save(student);
        return  student;

    }

    @Override
    public void deletestudent(int id) {
        studentRepository.deleteById(id);
    }


}
