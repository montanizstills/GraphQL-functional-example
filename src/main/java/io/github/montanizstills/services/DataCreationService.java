package io.github.montanizstills.services;

import io.github.montanizstills.models.*;
import io.github.montanizstills.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataCreationService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ClassRepository classRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private StudentGradeLevelInfoRepository studentGradeLevelInfoRepository;


    public void createStudent(String name, Contact contact, StudentGradeLevelInfo studentGradeLevelInfo, Address address, Schedule schedule){
        Student student = new Student(null,name,contact,address,schedule,studentGradeLevelInfo);
        studentRepository.save(student);
    }
}
