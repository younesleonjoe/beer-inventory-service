package com.younesleonjoe.beerinventoryservice.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "beer_inventories")
public class BeerInventory extends BaseEntity {
  
  private UUID beerId;
  private String upc;
  private Integer quantityOnHand = 0;
  @Builder
  public BeerInventory(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, UUID beerId,
                       String upc, Integer quantityOnHand) {
    super(id, version, createdDate, lastModifiedDate);
    this.beerId = beerId;
    this.upc = upc;
    this.quantityOnHand = quantityOnHand;
  }
}
