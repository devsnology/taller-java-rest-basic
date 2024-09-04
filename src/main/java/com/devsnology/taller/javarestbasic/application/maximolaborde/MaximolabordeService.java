package com.devsnology.taller.javarestbasic.application.maximolaborde;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeMaximo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaximolabordeService {

    @Autowired
    private MaximolabordeRepository MaximolabordeRepository;

    public CurriculumVitaeMaximo getUserInfo(String dni) {
        Optional<CurriculumVitaeMaximo> infoEncontrada = MaximolabordeRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }

    public CurriculumVitaeMaximo buscarNombre(String name) {
        return MaximolabordeRepository.buscarPorNombre(name);
    }
}
