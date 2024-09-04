package com.devsnology.taller.javarestbasic.application.maximolaborde;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeMaximo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaximolabordeRepository extends JpaRepository<CurriculumVitaeMaximo, String> {

    // buscar por dni

    CurriculumVitaeMaximo findByDni(String dni);

    // buscar por dni con native query
    @Query(value = "SELECT * FROM curriculum_Maximo WHERE name = ?1", nativeQuery = true)
    CurriculumVitaeMaximo buscarPorNombre(String name);
    List<CurriculumVitaeMaximo> findAllByName(String name);

}