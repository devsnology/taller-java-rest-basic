package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
import com.devsnology.taller.javarestbasic.application.shared.Debt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrancoIglesiasService {

    @Autowired
    private FrancoIglesiasRepository francoIglesiasRepository;
    @Autowired
    private FrancoIglesiasDebtRepository francoIglesiasRepositoryDebtRepository;

    public CurriculumVitae getUserInfo(String dni) {
        Optional<CurriculumVitae> infoEncontrada = francoIglesiasRepository.findById(dni);
        if (infoEncontrada.isPresent()) {
            return infoEncontrada.get();
        }
        return null;
    }

    public Debt getDebtInfo(String dni) {
        Optional<Debt> deudaEncontrada = francoIglesiasRepositoryDebtRepository.findById(dni);
        if (deudaEncontrada.isPresent()) {
            return deudaEncontrada.get();
        }
        return null;
    }
}
