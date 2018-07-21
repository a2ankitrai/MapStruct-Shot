package com.ank.mss.test;

import org.mapstruct.factory.Mappers;

import com.ank.mss.entity.DeliveryAddressDto;
import com.ank.mss.mapper.AddressMapper;
import com.ank.mss.vo.PersonVO;

public class AddressMapperTest {

    public static void main(String[] args) {
	
	PersonVO person = new PersonVO("Kimberly", 28); 
	
	AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);
	
	DeliveryAddressDto deliveryAddress = addressMapper.personAndAddressToDeliveryAddressDto(person, 42);
	
	System.out.println(deliveryAddress);
    }
}
