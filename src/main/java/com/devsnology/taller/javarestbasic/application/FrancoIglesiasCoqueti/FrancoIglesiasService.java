package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrancoIglesiasService {

    @Autowired
    private FrancoIglesiasRepository francoIglesiasRepositoryRepository;

    public CurriculumVitae getUserInfo(String dni) {
        Optional<CurriculumVitae> infoEncontrada = francoIglesiasRepositoryRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }
}
