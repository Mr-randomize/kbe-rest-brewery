package com.iviberberi.kberestbrewery.web.mappers;

import com.iviberberi.kberestbrewery.domain.Beer;
import com.iviberberi.kberestbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;


@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
