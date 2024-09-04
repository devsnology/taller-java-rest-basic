package com.devsnology.taller.javarestbasic.application.juanMarcucci;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeJuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JuanMarcucciService {

    @Autowired
    private JuanMarcucciRepository JuanMarcucciRepository;

    public CurriculumVitaeJuan getUserInfo(String dni){
        Optional<CurriculumVitaeJuan> infoEncontrada = JuanMarcucciRepository.findById(dni);
        if (infoEncontrada.isPresent()){
            return infoEncontrada.get();
        }
        return null;
    }

    public CurriculumVitaeJuan getUserName(String nombre){
        return JuanMarcucciRepository.EncontrarNombre(nombre);

    }
}
