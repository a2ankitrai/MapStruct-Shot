package com.ank.mss.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleDestination {

    private String name;
    private String description; 
    
//    public SimpleDestination(String name, String description) {
//	super();
//	this.name = name;
//	this.description = description;
//    }
//    public SimpleDestination() {
//	super(); 
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    
//    public String toString() {
//	return "["+name+","+description+"]";
//    }
    
}

