package com.fr.go;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.go.model.Student;
import com.fr.go.repository.StudentRepository;

@CrossOrigin
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/create")
	public void createStudent(@RequestBody Student student) {
		studentRepository.insert(student);
	}
	@PostMapping("/delete/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentRepository.deleteById(id);

	}
	@GetMapping("/list")
	public List<Student> listStudent() {
		return studentRepository.findAll();

	}
	
	
}