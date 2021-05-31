package ua.lviv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {}
