package com.devsnology.taller.javarestbasic.application.gerardoPalet;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerardoPaletRepository extends JpaRepository<CurriculumVitae, String> {


}
