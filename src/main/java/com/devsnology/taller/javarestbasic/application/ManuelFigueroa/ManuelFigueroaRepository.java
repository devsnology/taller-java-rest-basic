package com.devsnology.taller.javarestbasic.application.ManuelFigueroa;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeManuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManuelFigueroaRepository extends JpaRepository<CurriculumVitaeManuel, String> {


    // buscar por dni

    CurriculumVitaeManuel findByDni(String dni);

    // buscar por dni con native query
    @Query(value = "SELECT * FROM curriculum_Manuel WHERE name = ?1", nativeQuery = true)
    CurriculumVitaeManuel buscarPorNombre(String name);
    List<CurriculumVitaeManuel> findAllByName(String name);


}
