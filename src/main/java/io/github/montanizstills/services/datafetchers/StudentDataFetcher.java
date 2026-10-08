package io.github.montanizstills.services.datafetchers;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import io.github.montanizstills.models.Student;
import io.github.montanizstills.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDataFetcher implements DataFetcher<Student> {

    private StudentRepository studentRepository;

    @Override
    public Student get(DataFetchingEnvironment environment) {
        String name = environment.getArgument("name");
        return studentRepository.findByName(name);
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
