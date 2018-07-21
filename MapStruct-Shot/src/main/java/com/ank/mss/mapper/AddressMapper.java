package com.ank.mss.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ank.mss.entity.DeliveryAddressDto;
import com.ank.mss.vo.PersonVO;

@Mapper
public interface AddressMapper {

    @Mappings({
        @Mapping(source = "person.name", target = "description"),
        @Mapping(source = "hn", target = "houseNo")
    })
    DeliveryAddressDto personAndAddressToDeliveryAddressDto(PersonVO person, Integer hn);
}
