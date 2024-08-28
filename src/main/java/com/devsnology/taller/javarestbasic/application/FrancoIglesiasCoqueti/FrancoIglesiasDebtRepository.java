package com.devsnology.taller.javarestbasic.application.FrancoIglesiasCoqueti;

import com.devsnology.taller.javarestbasic.application.shared.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrancoIglesiasDebtRepository extends JpaRepository<Debt, String> {
}
