package com.example.pruebajwt.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class EndpointProtected {
        @PostMapping("/demo")
        public String hello() {
            return "Hello from secure endpoint";
        }

}
