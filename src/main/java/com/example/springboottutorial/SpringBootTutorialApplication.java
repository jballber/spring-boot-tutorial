package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // marks the SpringBootTutorialApplication class as a request handler (a REST controller)

public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping("/hello") //maps the sayHello() method to GET requests for /hello
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) { //maps the name method parameter to the myName web request parameter. If you don't provide the myName parameter in your web request, it will default to World
        return String.format("Hello %s!", name);
    }


    public class MetadataService {
        // fields
        // methods
        public String helloWorld() {
            return "Hello World!";
        }
    }

}

/*

Run Project : Shift+F10

http://localhost:8080/
http://localhost:8080/hello
 */