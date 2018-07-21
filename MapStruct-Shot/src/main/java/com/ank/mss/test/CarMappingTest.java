package com.ank.mss.test;

import org.mapstruct.factory.Mappers;

import com.ank.mss.entity.CarDto;
import com.ank.mss.mapper.CarMapper;
import com.ank.mss.mapper.abstractClass.CarMapperClass;
import com.ank.mss.vo.CarVO;

public class CarMappingTest {

    public static void main(String[] args) {
	
	CarVO carVO = new CarVO("1998", 4);
	
	CarMapper carMapper = Mappers.getMapper(CarMapper.class);
	
	CarDto carDto = carMapper.carToCarDto(carVO);
	 
	System.out.println("carDto= "+ carDto);
	
	
	//----------------------------------
	
	CarMapperClass carMapperClass = Mappers.getMapper(CarMapperClass.class);
	
	CarVO carVO2 = new CarVO("2006", 6);
	
	CarDto carDto2 = carMapperClass.carToCarDto(carVO2);
	
	System.out.println("carDto2= "+ carDto2);
	
	// ------------------------------------
	
	CarVO carVO3 = new CarVO("1957", 5);
	
	carMapper.updateCarFromDto(carDto2, carVO3);
	
	System.out.println("carVO3= "+ carVO3);
	
	
	
    }
}
