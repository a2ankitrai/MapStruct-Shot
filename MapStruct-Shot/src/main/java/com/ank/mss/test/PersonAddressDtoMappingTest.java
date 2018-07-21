package com.ank.mss.test;

import org.mapstruct.factory.Mappers;

import com.ank.mss.entity.PersonDto;
import com.ank.mss.mapper.PersonAddressDtoMapper;
import com.ank.mss.vo.AddressVO;
import com.ank.mss.vo.PersonVO;

public class PersonAddressDtoMappingTest {

    public static void main(String[] args) {
	
	PersonVO person = new PersonVO("Valkyr", 32);
	
	AddressVO address = new AddressVO(14, "Teizona", "Okitwana");
	
	PersonAddressDtoMapper mapper = Mappers.getMapper(PersonAddressDtoMapper.class);
	
	PersonDto personAddressDto = mapper.createPersonDTO(person, address);
	
	System.out.println(personAddressDto);
	
    }
}
