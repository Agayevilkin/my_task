package project_spring.my_task.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import project_spring.my_task.dto.StudentDto;
import project_spring.my_task.model.Student;
import project_spring.my_task.repository.StudentRepository;


@Slf4j
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper mapper;

    public StudentDto createStudent(StudentDto studentDto) {
        log.info("Student details received {}", studentDto);
        Student student = mapper.map(studentDto, Student.class);
        student.setId(null);
        final Student save = studentRepository.save(student);
        return mapper.map(save, StudentDto.class);

    }

    public StudentDto findById(Long id) {
        return studentRepository.findById(id)
                .map((s)-> mapper.map(s, StudentDto.class))
                .orElseThrow(()-> new RuntimeException("Error!"));
    }
}
