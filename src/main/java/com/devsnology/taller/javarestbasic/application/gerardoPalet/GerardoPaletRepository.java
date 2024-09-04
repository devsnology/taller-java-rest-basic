package com.devsnology.taller.javarestbasic.application.gerardoPalet;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeTomasErrezarret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GerardoPaletRepository extends JpaRepository<CurriculumVitaeTomasErrezarret, String> {


    // buscar por dni

    CurriculumVitaeTomasErrezarret findByDni(String dni);

    // buscar por dni con native query
    @Query(value = "SELECT * FROM curriculum_vitae WHERE name = ?1", nativeQuery = true)
    CurriculumVitaeTomasErrezarret buscarPorNombre(String name);
    List<CurriculumVitaeTomasErrezarret> findAllByName(String name);


}
