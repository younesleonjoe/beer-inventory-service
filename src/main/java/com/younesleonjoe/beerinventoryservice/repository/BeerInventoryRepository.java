package com.younesleonjoe.beerinventoryservice.repository;

import com.younesleonjoe.beerinventoryservice.entity.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

  List<BeerInventory> findAllByBeerId(UUID beerId);
}
