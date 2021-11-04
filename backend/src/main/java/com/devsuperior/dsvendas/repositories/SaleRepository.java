package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

  public static final String STRING = "SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount))"
      + "FROM Sale AS obj GROUP BY obj.seller";

  @Query(STRING)

  List<SaleSumDTO> amountGroupedBySeller();

  public static final String STR = "SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals))"
      + "FROM Sale AS obj GROUP BY obj.seller";

  @Query(STR)

  List<SaleSuccessDTO> successGroupedBySeller();
}
