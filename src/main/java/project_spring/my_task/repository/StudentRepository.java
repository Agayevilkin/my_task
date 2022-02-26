package project_spring.my_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
        import project_spring.my_task.model.Student;

        import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student, Long> {


}

