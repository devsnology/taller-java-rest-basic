package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrancoIglesiasService {

    @Autowired
    private FrancoIglesiasRepository francoIglesiasRepository;

    public CurriculumVitae getUserInfo(String dni) {
        Optional<CurriculumVitae> infoEncontrada = francoIglesiasRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }

    public CurriculumVitae buscarPorNombre(String name) {
        return francoIglesiasRepository.buscarPorNombre(name);
    }
}
