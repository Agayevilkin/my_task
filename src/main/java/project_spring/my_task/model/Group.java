package project_spring.my_task.model;


import lombok.Data;

import javax.persistence.*;

@Data // for getter and setter method
@Entity // for save to database
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupsName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "courses")
    private Course course;
}
