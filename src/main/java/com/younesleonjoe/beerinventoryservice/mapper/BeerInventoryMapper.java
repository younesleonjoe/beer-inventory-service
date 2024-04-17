package com.younesleonjoe.beerinventoryservice.mapper;

import com.younesleonjoe.beerinventoryservice.dto.BeerInventoryDTO;
import com.younesleonjoe.beerinventoryservice.entity.BeerInventory;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

  BeerInventory beerInventoryDTOToBeerInventory(BeerInventoryDTO beerInventoryDTO);

  BeerInventoryDTO beerInventoryToBeerInventoryDTO(BeerInventory beerInventory);
}
