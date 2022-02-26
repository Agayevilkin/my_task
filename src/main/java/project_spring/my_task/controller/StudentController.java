package project_spring.my_task.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project_spring.my_task.dto.StudentDto;
import project_spring.my_task.model.Student;
import project_spring.my_task.repository.StudentRepository;
import project_spring.my_task.services.StudentService;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public StudentDto getStudent(@PathVariable("id") Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    public StudentDto createStudent(@RequestBody StudentDto studentDto) {
        return studentService.createStudent(studentDto);
    }
}
