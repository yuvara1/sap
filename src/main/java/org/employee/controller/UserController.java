package org.employee.controller;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping ("/user")
public class UserController {
    @GetMapping()
    public ResponseEntity<List<Map<String,String>>> getUser() {
        System.out.println("UserController.getUser");
        return ResponseEntity.ok().body(new ArrayList<>(){{;
            add(Map.of("name","John Doe", "email","jon@gmail.com", "phone","1234567890"));
            add(Map.of("name","yuvi", "email","yuvi", "phone","1234567890"));
        }});
    }
}
