package com.devsnology.taller.javarestbasic.application.juanMarcucci;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeJuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuanMarcucciRepository extends JpaRepository<CurriculumVitaeJuan, String > {

    @Query(value = "SELECT * FROM curriculum_juan WHERE nombre = ?1" , nativeQuery = true)
    CurriculumVitaeJuan EncontrarNombre(String nombre);

    List<CurriculumVitaeJuan> findAllByNombre(String nombre);
}
