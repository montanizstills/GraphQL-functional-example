package io.github.montanizstills.controllers;

import graphql.ExecutionResult;
import io.github.montanizstills.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/rest/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<ExecutionResult> getAllStudents(@RequestBody String studentQuery){
        ExecutionResult executionResult = studentService.getGraphQL().execute(studentQuery);
        return new ResponseEntity<>(executionResult, HttpStatus.OK);
    }
}
