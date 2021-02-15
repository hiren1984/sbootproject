package com.test.sbootproject.Controller;

import com.test.sbootproject.dto.Deleterequest;
import com.test.sbootproject.dto.LoginRequest;
import com.test.sbootproject.entity.Student;
import com.test.sbootproject.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sbootcontroller {

    @Autowired
    Studentservice studentservice;

    @GetMapping("/name")
    public String testget() {
        return "Hiren";
    }

    @GetMapping("/product/{productid}/{categoryid")
    @ResponseBody
    public String examplewithpathvarible(@PathVariable("productid") int productid,
                                         @PathVariable("categoryid") int categoryid) {
        return "Product info for product id :  " + productid + " with category id " + categoryid;
    }

    @GetMapping("/Book")
    @ResponseBody
    public String examplewithpathvariable(@RequestParam("bookid") int bookid,
                                          @RequestParam("bookname") String bookname) {
        return "book id : " + bookid + "book name : " + bookname;
    }

    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody LoginRequest loginRequest) {
        boolean validate = studentservice.login(loginRequest);
        return validate;
    }

    @PostMapping("/save")
    @ResponseBody
    public Student saveStudent(@RequestBody Student student) {
        Student response = studentservice.save(student);
        return response;

    }

    @GetMapping("/student/{studentid}")
    @ResponseBody
    public Student getstudentbyid(@PathVariable("studentid") int studentid) {
        Student student = studentservice.searchById(studentid);
        return student;

    }

    @GetMapping("/getstudents")
    @ResponseBody
    public Student getstudents() {
        Student student = studentservice.searchById(2);
        return student;
    }

    @PutMapping("/updatestudent")
    @ResponseBody
    public Student updatestudent(@RequestBody Student student) {
        Student response = studentservice.updatestudent(student);
        return response;
    }

    @DeleteMapping("deletestudent")
    @ResponseBody
    public String deletestudent(@RequestBody Deleterequest deleterequest) {
        studentservice.deletestudent(deleterequest.getId());
        return "sucess";

    }





}
