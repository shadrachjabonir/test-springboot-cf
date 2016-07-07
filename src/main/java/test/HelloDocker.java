package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shadr on 07/07/2016.
 */

@SpringBootApplication
@RestController
public class HelloDocker {

    @RequestMapping("/")
    public String home() {
        return "Hello welcome to Docker ";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloDocker.class, args);
    }
}
