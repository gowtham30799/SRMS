package com.example.studentmgmt.service;

import com.example.studentmgmt.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    
    // Using Collections Framework as the data store
    private final List<Student> students = new ArrayList<>();
    private int currentId = 1;

    // ADD Record
    public Student addStudent(Student student) {
        student.setId(currentId++);
        students.add(student);
        return student;
    }

    // SHOW All Records
    public List<Student> getAllStudents() {
        return students;
    }

    // SEARCH Record by ID
    public Optional<Student> getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }

    // SEARCH Records by Name (Partial match)
    public List<Student> searchStudentsByName(String keyword) {
        return students.stream()
                .filter(s -> s.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    // UPDATE Record
    public Student updateStudent(int id, Student updatedDetails) {
        for (int i = 0; i < students.size(); i++) {
            Student existingStudent = students.get(i);
            if (existingStudent.getId() == id) {
                updatedDetails.setId(id); // Ensure ID remains the same
                students.set(i, updatedDetails);
                return updatedDetails;
            }
        }
        return null; // Return null if student not found
    }

    // DELETE Record
    public boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
}