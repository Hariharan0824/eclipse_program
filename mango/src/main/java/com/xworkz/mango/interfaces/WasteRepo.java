package com.xworkz.mango.interfaces;

import com.xworkx.mango.DTO.WasteDTO;


public interface WasteRepo {

	String WasteRepo="plastic";
	int ITEMS=3;
	
	 boolean save(WasteDTO wastedto);
}
