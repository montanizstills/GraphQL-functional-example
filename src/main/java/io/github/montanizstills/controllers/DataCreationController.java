package io.github.montanizstills.controllers;

import io.github.montanizstills.models.Class;
import io.github.montanizstills.models.Student;
import io.github.montanizstills.services.DataCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/create/")
public class DataCreationController {
    @Autowired
    private DataCreationService dataCreationService;

    @PostMapping(path = "student/")
    public ResponseEntity<Student> createStudent(@RequestBody String requestBody){

        return new ResponseEntity<>(new Student(), HttpStatus.OK);
    }

    @PostMapping(path = "class/")
    public ResponseEntity createClass(@RequestBody String requestBody){

        return new ResponseEntity(new Class(), HttpStatus.OK);
    }
}
