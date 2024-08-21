package com.devsnology.taller.javarestbasic.application.juanMarcucci;
import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeJuan;
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
@RequestMapping("/marcucci-juan")
public class JuanMarcucciController {

    @Autowired
    private JuanMarcucciService JuanMarcucciService;

    @GetMapping("/cv/{dni}")
    public ResponseEntity<Resource> index(@PathVariable(required = false) String dni) throws IOException {
        Resource resource = new ClassPathResource("staticMarcucciJuan/index.html");
        String content = new String(Files.readAllBytes(resource.getFile().toPath()));

        //cambia el path para luego hacer la solicitud
        String pathDinamico = "marcucci-juan/info/" + dni;
        content = content.replace("DINAMIC_PATH", pathDinamico);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");
        return ResponseEntity.ok().headers(headers).body(new ByteArrayResource(content.getBytes()));
    }

    @GetMapping("/info/{dni}")
    public ResponseEntity<CurriculumVitaeJuan> info(@PathVariable(required = false) String dni) throws IOException{
        CurriculumVitaeJuan datos = JuanMarcucciService.getUserInfo(dni);
        return ResponseEntity.ok().body(datos);
    }
}
