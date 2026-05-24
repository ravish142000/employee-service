package com.company.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/employees")

    public String employees() {

        return "Employee Servicde Runnindg Java 21";

    }
}
