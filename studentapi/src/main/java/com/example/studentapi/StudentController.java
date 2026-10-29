package com.example.studentapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
	@PutMapping("/{id}")
	public Student updateStudent(
	        @PathVariable Long id,
	        @RequestBody Student student) {

	    return repository.findById(id)
	            .map(existing -> {
	                existing.setName(student.getName());
	                existing.setEmail(student.getEmail());
	                return repository.save(existing);
	            })
	            .orElse(null);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
	    repository.deleteById(id);
	}

    @Autowired
    private StudentRepository repository;

    // WRITE data
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    // READ all data
    @GetMapping
    public List<Student> getStudents() {
        return repository.findAll();
    }

    // READ by ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}