package edu.fsw.simplewebapplication;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebController {

    @Operation(summary = "sends a hello message")
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @Operation(summary = "sends a hello message with the entered name")
    @GetMapping("/hello/{name}")
    public String hello_name(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }
}
