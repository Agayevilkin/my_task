package project_spring.my_task.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project_spring.my_task.services.StudentService;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class CourseController {

    private final StudentService studentService;
}
