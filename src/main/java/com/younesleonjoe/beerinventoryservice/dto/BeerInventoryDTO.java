package com.younesleonjoe.beerinventoryservice.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerInventoryDTO {

  private UUID id;
  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;
  private UUID beerId;
  private Integer quantityOnHand;
}
