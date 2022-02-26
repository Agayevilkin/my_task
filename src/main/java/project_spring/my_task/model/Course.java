package project_spring.my_task.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data // for getter and setter method
@Entity // for save to database
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<Group> groups;
}
