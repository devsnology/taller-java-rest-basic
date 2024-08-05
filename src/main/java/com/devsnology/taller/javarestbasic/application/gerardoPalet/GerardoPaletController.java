package com.devsnology.taller.javarestbasic.application.gerardoPalet;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/gerardo-palet")
public class GerardoPaletController {

    @GetMapping("/cv")
    public ResponseEntity<Resource> index() throws IOException {
        Resource resource = new ClassPathResource("static/gerardoPalet/index.html");
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");
        return ResponseEntity.ok().headers(headers).body(resource);
    }


}
