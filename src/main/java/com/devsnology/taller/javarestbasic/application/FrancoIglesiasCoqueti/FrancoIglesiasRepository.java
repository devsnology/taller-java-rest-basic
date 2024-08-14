package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.shared.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrancoIglesiasRepository extends JpaRepository<CurriculumVitae, String> {


}
