package com.student.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.Student;
import com.student.management.repositories.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository repo;
	
	@Override
	public String addStudent(Student st) {
		repo.save(st);		
		return "student added";
	}

	@Override
	public Student searchStudent(int roll) {
//		return repo.findById(roll).get();
		Student st = repo.findById(roll).get();
		return st;
	}

	@Override
	public String updateStudent(Student st) {
		repo.save(st);
		return "student updated";
	}

	@Override
	public String deleteStudent(int roll) {
		repo.deleteById(roll);
		return "student deleted";
	
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();	
	}

	@Override
	public String deleteAllStudents() {
		repo.deleteAll();		
		return "all student deleted";
	}
}
