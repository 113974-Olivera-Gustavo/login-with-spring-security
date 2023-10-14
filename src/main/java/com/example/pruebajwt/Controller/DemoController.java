package com.example.pruebajwt.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class DemoController {

        @PostMapping("/demo")
        public String hello() {
            return "Hello from secure endpoint";
        }


}
