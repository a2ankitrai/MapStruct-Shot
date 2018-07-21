package com.ank.mss.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ank.mss.entity.PersonDto;
import com.ank.mss.vo.AddressVO;
import com.ank.mss.vo.PersonVO;

@Mapper
public interface PersonAddressDtoMapper {

    @Mappings({
	@Mapping(source="person.name", target="username"),
	@Mapping(source="person.age", target="ageInYears"),
	@Mapping(source="address.flatNo", target="houseNo"),
	@Mapping(source="address.area", target="locality"),
	@Mapping(source="address.city", target="city")
    })
    PersonDto createPersonDTO(PersonVO person, AddressVO address);
}
