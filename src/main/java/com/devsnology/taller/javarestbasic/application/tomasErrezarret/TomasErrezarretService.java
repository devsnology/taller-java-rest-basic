package com.devsnology.taller.javarestbasic.application.tomasErrezarret;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeTomasErrezarret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TomasErrezarretService {

    @Autowired
    private TomasErrezarretRepository tomasErrezarretRepository;

    public CurriculumVitaeTomasErrezarret getUserInfo(String dni) {
        Optional<CurriculumVitaeTomasErrezarret> infoEncontrada = tomasErrezarretRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }

    public CurriculumVitaeTomasErrezarret buscarPorNombre(String name) {
        return tomasErrezarretRepository.BuscarNombre(name);
    }
}
