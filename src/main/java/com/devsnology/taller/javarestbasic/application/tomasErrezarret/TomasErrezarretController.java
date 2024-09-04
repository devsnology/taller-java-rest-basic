package com.devsnology.taller.javarestbasic.application.tomasErrezarret;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeTomasErrezarret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;

@RestController
@RequestMapping("/tomas-errezarret")
public class TomasErrezarretController {

    @Autowired
    private TomasErrezarretService tomasErrezarretService;

    @GetMapping("/cv/{dni}")
    public ResponseEntity<Resource> index(@PathVariable(required = false) String dni) throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        String content = new String(
                Files.readAllBytes(
                        resource.getFile().toPath()
                )
        );

        String dynamicPath = "tomas-errezarret/info/" + dni;
        content = content.replace("DINAMIC_PATH", dynamicPath);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");

        return ResponseEntity.ok().headers(headers).body(new ByteArrayResource(content.getBytes()));
    }

    @GetMapping("/info/{dni}")
    public ResponseEntity<CurriculumVitaeTomasErrezarret> info(@PathVariable(required = false) String dni) throws IOException {
        CurriculumVitaeTomasErrezarret data = tomasErrezarretService.getUserInfo(dni);
        return ResponseEntity.ok().body(data);
    }

    @GetMapping("/info/{name}")
    public ResponseEntity<CurriculumVitaeTomasErrezarret> infoByName(@PathVariable(required = false) String name) throws IOException {
        CurriculumVitaeTomasErrezarret data = tomasErrezarretService.buscarPorNombre(name);
        return ResponseEntity.ok().body(data);
    }
}
