package project_spring.my_task;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class MyTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTaskApplication.class, args);
    }

}
