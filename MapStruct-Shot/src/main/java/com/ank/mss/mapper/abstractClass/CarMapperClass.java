package com.ank.mss.mapper.abstractClass;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ank.mss.entity.CarDto;
import com.ank.mss.vo.CarVO;

@Mapper
public abstract class CarMapperClass {

    @Mappings({
        @Mapping(source = "make", target = "manufacture"),
        @Mapping(source = "seatCount", target = "noOfSeats")
    })
    public abstract CarDto carToCarDto(CarVO car);
}
