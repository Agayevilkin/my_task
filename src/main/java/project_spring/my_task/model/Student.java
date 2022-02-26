package project_spring.my_task.model;


import lombok.Data;

import javax.persistence.*;

@Data // for getter and setter method
@Entity // for save to database
@Table(name = "students")
public class Student {

    @Id // for save in table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for automatically generate by the system
    private Long id;

    private String first_name;
    private String last_name;
    private String student_address;
    private int age;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "student_address") //75
    private Address address;


}
