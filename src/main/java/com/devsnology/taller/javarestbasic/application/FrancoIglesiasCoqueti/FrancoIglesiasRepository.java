package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrancoIglesiasRepository extends JpaRepository<CurriculumVitae, String> {

    CurriculumVitae findByDni(String dni);

    // buscar por dni con native query
    @Query(value = "SELECT * FROM curriculum_vitae WHERE name = ?1", nativeQuery = true)
    CurriculumVitae buscarPorNombre(String name);
    List<CurriculumVitae> findAllByName(String name);
}
