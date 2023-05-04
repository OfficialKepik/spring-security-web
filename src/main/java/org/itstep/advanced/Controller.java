package org.itstep.advanced;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/root")
    public String root() {
        return "root";
    }

    @GetMapping("/root/1")
    public String root1() {
        return "root 1";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/guest")
    public String demo() {
        return "demo";
    }

    @GetMapping("/common")
    public String common() {
        return "common";
    }
} 
