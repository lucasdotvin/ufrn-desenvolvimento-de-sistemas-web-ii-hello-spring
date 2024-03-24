package vin.lucas.hellospring.presentation.http.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello Spring!!!";
    }
}
