package com.devsnology.taller.javarestbasic.application.juanMarcucci;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitaeJuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuanMarcucciRepository extends JpaRepository<CurriculumVitaeJuan, String > {
}
