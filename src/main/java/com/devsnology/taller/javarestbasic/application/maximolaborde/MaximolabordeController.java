package com.devsnology.taller.javarestbasic.application.maximolaborde;
import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeMaximo;
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
@RequestMapping("/laborde-maximo")
public class MaximolabordeController {

    @Autowired
    private MaximolabordeService MaximolabordeService;

    @GetMapping("/cv/{dni}")
    public ResponseEntity<Resource> index(@PathVariable(required = false) String dni) throws IOException {
        Resource resource = new ClassPathResource("staticmaximolaborde/indexmaximo.html");
        String content = new String(Files.readAllBytes(resource.getFile().toPath()));

        //cambia el path para luego hacer la solicitud
        String pathDinamico = "laborde-maximo/info/" + dni;
        content = content.replace("DINAMIC_PATH", pathDinamico);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");
        return ResponseEntity.ok().headers(headers).body(new ByteArrayResource(content.getBytes()));
    }

    @GetMapping("/info/{dni}")
    public ResponseEntity<CurriculumVitaeMaximo> info(@PathVariable(required = false) String dni) throws IOException{
        CurriculumVitaeMaximo data = MaximolabordeService.getUserInfo(dni);
            return ResponseEntity.ok().body(data);

    }
    @GetMapping("/info/name/{name}")
    public ResponseEntity<CurriculumVitaeMaximo> infoByName(@PathVariable(required = false) String name) throws IOException {
        CurriculumVitaeMaximo data = MaximolabordeService.buscarNombre(name);
        return ResponseEntity.ok().body(data);
    }

}

