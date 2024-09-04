package com.devsnology.taller.javarestbasic.application.tomasErrezarret;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeTomasErrezarret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TomasErrezarretRepository extends JpaRepository<CurriculumVitaeTomasErrezarret, String> {

    @Query(value = "SELECT * FROM curriculum_vitae WHERE name = ?1", nativeQuery = true)
    CurriculumVitaeTomasErrezarret BuscarNombre(String name);
    List<CurriculumVitaeTomasErrezarret> findAllByName(String name);


}
