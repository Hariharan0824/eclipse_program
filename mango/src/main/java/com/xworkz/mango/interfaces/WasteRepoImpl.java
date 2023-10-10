package com.xworkz.mango.interfaces;

import com.xworkx.mango.DTO.WasteDTO;

public class WasteRepoImpl implements WasteRepo{
	
	
	private WasteDTO[] wdto= new WasteDTO[ITEMS];
	private int index = 0;

	@Override
	public boolean save(WasteDTO wastedto) {
		System.out.println("Invoking save method");
		System.out.println("Waste saved:"+wdto);
		if(this.index<ITEMS) {
			this.wdto[index]=wastedto;
			System.out.println("Waste saved at:"+this.index);
			index++;
		}else {
			System.err.println("Dataset is full...");
		}


		return false;
	}

}
