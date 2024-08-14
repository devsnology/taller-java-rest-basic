package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.gerardoPalet.GerardoPaletService;
import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
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
@RequestMapping("/franco-iglesias")
public class FrancoIglesiasController {

    @Autowired
    private GerardoPaletService gerardoPaletService;

    @GetMapping("/cv/{dni}")
    public ResponseEntity<Resource> index(@PathVariable(required = false) String dni) throws IOException {
        Resource resource = new ClassPathResource("static/francoIglesias/index.html");
        String content = new String(Files.readAllBytes(resource.getFile().toPath()));

        // Reemplazar el marcador DINAMIC_PATH con el path correcto
        String dynamicPath = "franco-iglesias/info/" + dni;
        content = content.replace("DINAMIC_PATH", dynamicPath);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");

        return ResponseEntity.ok().headers(headers).body(new ByteArrayResource(content.getBytes()));
    }

    @GetMapping("/info/{dni}")
    public ResponseEntity<CurriculumVitae> info(@PathVariable(required = false) String dni) throws IOException {
        CurriculumVitae data = gerardoPaletService.getUserInfo(dni);
        return ResponseEntity.ok().body(data);
    }

}
