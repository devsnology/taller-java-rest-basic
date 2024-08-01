package com.devsnology.taller.javarestbasic.ejemplo.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class EjemploRestController {

    @PostMapping("/create")
    public String create() {
        return "create";
    }

    @GetMapping("/read")
    public String read() {
        return "read";
    }

    @GetMapping("/update")
    public String update() {
        return "update";
    }

    @GetMapping("/delete")
    public String delete() {
        return "delete";
    }
    
}
