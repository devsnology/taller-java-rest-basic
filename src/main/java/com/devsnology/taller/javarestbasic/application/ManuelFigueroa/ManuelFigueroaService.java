package com.devsnology.taller.javarestbasic.application.ManuelFigueroa;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeManuel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManuelFigueroaService {

    @Autowired
    private ManuelFigueroaRepository ManuelFigueroaRepository;

    public CurriculumVitaeManuel getUserInfo(String dni) {
        Optional<CurriculumVitaeManuel> infoEncontrada = ManuelFigueroaRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }


    public CurriculumVitaeManuel buscarPorNombre(String name) {
        return ManuelFigueroaRepository.buscarPorNombre(name);
    }
}
