package cn.mirrorming.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Mireal
 */
@SpringBootApplication
@ComponentScan(value = "cn.mirrorming.learning.*")
public class SpringBootScalaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootScalaApplication.class, args);
    }
}
