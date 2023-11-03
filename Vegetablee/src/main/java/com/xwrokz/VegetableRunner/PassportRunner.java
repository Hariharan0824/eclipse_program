package com.xwrokz.VegetableRunner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PassportRunner {

	public static void main(String[] args) {
		
		President1DTO person=new President1DTO("hari",1,"hariharansivaraj08",6379589719L);
		President1DTO person1=new President1DTO("hariharan",2,"hariharansivaraj08",6379589719L);
		President1DTO person2=new President1DTO("hari",3,"hariharansivaraj08",6379589719L);
		President1DTO person3=new President1DTO("siva",4,"hariharansivaraj08",6379589719L);
		
		PassportDTO pass=new PassportDTO(1,10,"hari",LocalDate.of(1999, 3, 1));
		
		Map<String, String> map=new HashMap<String, String>();
		
		
	}
}
