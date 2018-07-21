package com.ank.mss.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.ank.mss.entity.CarDto;
import com.ank.mss.vo.CarVO;

@Mapper
public interface CarMapper {

    @Mappings({
        @Mapping(source = "make", target = "manufacture"),
        @Mapping(source = "seatCount", target = "noOfSeats")
    })
    CarDto carToCarDto(CarVO car);
    
    @Mappings({
        @Mapping(source = "manufacture", target = "make"),
        @Mapping(source = "noOfSeats", target = "seatCount")
    })
    void updateCarFromDto(CarDto carDto, @MappingTarget CarVO car);
   
}
