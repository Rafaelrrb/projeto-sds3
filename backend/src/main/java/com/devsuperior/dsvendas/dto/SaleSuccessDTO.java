package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
  private String sellerName;
  private Long visited;
  private Long deals;

  public SaleSuccessDTO() {
  }

  public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
    this.sellerName = seller.getName();
    this.setVisited(visited);
    this.setDeals(deals);
  }

  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Long getDeals() {
    return deals;
  }

  public void setDeals(Long deals) {
    this.deals = deals;
  }

  public Long getVisited() {
    return visited;
  }

  public void setVisited(Long visited) {
    this.visited = visited;
  }

}
