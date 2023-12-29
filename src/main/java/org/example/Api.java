package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Api {
    @GetMapping("/user")
    public void print(){
        System.out.println();
    }
}
