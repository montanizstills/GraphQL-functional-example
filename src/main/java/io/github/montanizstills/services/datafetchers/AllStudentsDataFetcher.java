package io.github.montanizstills.services.datafetchers;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import io.github.montanizstills.models.Student;
import io.github.montanizstills.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllStudentsDataFetcher implements DataFetcher<List<Student>> {

    private StudentRepository studentRepository;

    @Override
    public List<Student> get(DataFetchingEnvironment environment) {
        return studentRepository.findAll();
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
