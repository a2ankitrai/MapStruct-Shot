package com.ank.mss.test;

import org.mapstruct.factory.Mappers;

import com.ank.mss.mapper.SimpleSourceDestinationMapper;
import com.ank.mss.vo.SimpleDestination;
import com.ank.mss.vo.SimpleSource;

public class SimpleSourceDestinationTest {

    public static void main(String[] args) {
	
	SimpleSource simpleSource = new SimpleSource("name","value");
	
	SimpleSourceDestinationMapper simpleSourceDestinationMapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);
	
	SimpleDestination simpleDestination = simpleSourceDestinationMapper.sourceToDestination(simpleSource);
	
	System.out.println(simpleDestination);
	
    }
}
