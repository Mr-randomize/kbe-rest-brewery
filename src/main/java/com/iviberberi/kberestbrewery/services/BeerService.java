package com.iviberberi.kberestbrewery.services;

import com.iviberberi.kberestbrewery.web.model.BeerDto;
import com.iviberberi.kberestbrewery.web.model.BeerPagedList;
import com.iviberberi.kberestbrewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;


public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);

    void deleteBeerById(UUID beerId);
}
