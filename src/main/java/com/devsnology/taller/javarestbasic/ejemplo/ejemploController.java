package com.devsnology.taller.javarestbasic.ejemplo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ejemplo")
public class ejemploController {

    @GetMapping
    public String ejemplo() {
        return "Hola mundo";
    }
}
