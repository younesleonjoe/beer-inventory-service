package com.younesleonjoe.beerinventoryservice.controller;

import com.younesleonjoe.beerinventoryservice.dto.BeerInventoryDTO;
import com.younesleonjoe.beerinventoryservice.mapper.BeerInventoryMapper;
import com.younesleonjoe.beerinventoryservice.repository.BeerInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerInventoryController {

  private final BeerInventoryRepository beerInventoryRepository;

  private final BeerInventoryMapper beerInventoryMapper;

  @GetMapping("api/v1/beers/{id}/inventories")
  public List<BeerInventoryDTO> listBeersById(@PathVariable UUID id) {

    log.debug("Finding inventory for beerId {}", id);

    return beerInventoryRepository.findAllByBeerId(id).stream()
        .map(beerInventoryMapper::beerInventoryToBeerInventoryDTO)
        .collect(Collectors.toList());
  }
}
