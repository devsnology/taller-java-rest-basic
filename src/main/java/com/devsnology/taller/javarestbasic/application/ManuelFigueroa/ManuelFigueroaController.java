package com.devsnology.taller.javarestbasic.application.ManuelFigueroa;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeManuel;
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
@RequestMapping("/manuel-figueroa")
public class ManuelFigueroaController {

    @Autowired // Inyeccion de dependencia = A que spring haga la instancia de la clase por mí.
    private ManuelFigueroaService ManuelFigueroaService;

    @GetMapping("/cv/{dni}") // puerta entrada, tiene un formato GET /gerardo-palet/cv/33333333
    public ResponseEntity<Resource> index(@PathVariable(required = false) String dni) throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        String content = new String(
                Files.readAllBytes(
                        resource.getFile().toPath()
                )
        );

        // Reemplazar el marcador DINAMIC_PATH con el path correcto
        String dynamicPath = "manuel-figueroa/info/" + dni;
        content = content.replace("DINAMIC_PATH", dynamicPath);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/html; charset=UTF-8");

        return ResponseEntity.ok().headers(headers).body(new ByteArrayResource(content.getBytes()));
    }

    @GetMapping("/info/{dni}")
    public ResponseEntity<CurriculumVitaeManuel> info(@PathVariable(required = false) String dni) throws IOException {
        CurriculumVitaeManuel data = ManuelFigueroaService.getUserInfo(dni);
        return ResponseEntity.ok().body(data);
    }

    @GetMapping("/info/name/{name}")
    public ResponseEntity<CurriculumVitaeManuel> infoByName(@PathVariable(required = false) String name) throws IOException {
        CurriculumVitaeManuel data = ManuelFigueroaService.buscarPorNombre(name);
        return ResponseEntity.ok().body(data);
    }

}
