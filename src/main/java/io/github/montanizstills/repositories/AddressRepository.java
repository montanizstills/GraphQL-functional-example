package io.github.montanizstills.repositories;

import io.github.montanizstills.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Student,Long> {

}
