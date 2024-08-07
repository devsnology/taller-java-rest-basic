package com.devsnology.taller.javarestbasic.ejemplo.controller;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
@RequestMapping("/marcucci-juan")
public class EjemploController {

    @GetMapping("/")
    public ResponseEntity<Resource> index() throws IOException {
        Resource resource = new ClassPathResource("staticMarcucciJuan/index.html");
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");
        return ResponseEntity.ok().headers(headers).body(resource);
    }
}
