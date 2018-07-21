package com.ank.mss.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ank.mss.vo.SimpleDestination;
import com.ank.mss.vo.SimpleSource;

@Mapper
public interface SimpleSourceDestinationMapper {

    @Mappings({
	      @Mapping(target="name", source="source.name"),
	      @Mapping(target="description", source="source.description")
	    })
    SimpleDestination sourceToDestination(SimpleSource source);
    
    SimpleSource destinationToSource(SimpleDestination destination);
    
}
