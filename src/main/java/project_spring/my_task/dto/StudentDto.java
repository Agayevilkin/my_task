package project_spring.my_task.dto;

import lombok.Data;

@Data
public class StudentDto {

    private Long id;
    private String first_name;
    private String last_name;
    private String student_email;
    private String phone_number;
    private int age;
}
