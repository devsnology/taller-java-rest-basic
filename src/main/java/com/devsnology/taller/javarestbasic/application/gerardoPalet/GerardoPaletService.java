package com.devsnology.taller.javarestbasic.application.gerardoPalet;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeTomasErrezarret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GerardoPaletService {

    @Autowired
    private GerardoPaletRepository gerardoPaletRepository;

    public CurriculumVitaeTomasErrezarret getUserInfo(String dni) {
        Optional<CurriculumVitaeTomasErrezarret> infoEncontrada = gerardoPaletRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }


    public CurriculumVitaeTomasErrezarret buscarPorNombre(String name) {
        return gerardoPaletRepository.buscarPorNombre(name);
    }
}
