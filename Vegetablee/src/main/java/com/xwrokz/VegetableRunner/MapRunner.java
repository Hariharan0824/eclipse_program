package com.xwrokz.VegetableRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapRunner {
 
	
	public static void main(String[] args) {
		
		Map<String, String> maps=new HashMap<String, String>();
		
		maps.put("8217634102", "Aishwarya"); //Entry
		maps.put("6379589419", "Siva"); //Entry
		maps.put("9585256261", "Nirmala"); //Entry
		maps.put("9585069797", "Hari"); //Entry
		maps.put("9524321441", "Dinesh"); //Entry
		maps.put("9876543210", "Krishna"); //Entry
		maps.put("8765432109", "rahul"); //Entry
		maps.put("7654321098", "Aakash"); //Entry
		maps.put("8901234567", "santhoshKumar"); //Entry
		maps.put("9887667890", "sarvesh"); //Entry
		maps.put("9011234534", "ravi"); //Entry
		maps.put("9876541107", "sagar"); //Entry
		maps.put("9994444444", "vinotha"); //Entry
		maps.put("9898552266", "vijay"); //Entry
		maps.put("9977123765", "ajith"); //Entry
		maps.put("9876234587", "surya"); //Entry
		maps.put("7898754322", "kamal"); //Entry
		maps.put("8844789012", "ranjini"); //Entry
		maps.put("8972345678", "ranjith"); //Entry
		maps.put("9876234567", "raja"); //Entry
		
		maps.values().stream().filter(c->c.length()<10).forEach(System.out::println);
		System.out.println("----------------------------");
		maps.values().stream().filter(c->c.length()>10).forEach(System.out::println);
		System.out.println("----------------------------");
		maps.values().stream().forEach(c -> System.out.println(c.toUpperCase()));
		System.out.println("----------------------------");
		List<String> maps1=maps.keySet().stream().filter(c -> c.startsWith("8")).collect(Collectors.toList());
		maps1.forEach(c -> System.out.println(c));
		System.out.println("----------------------------");
		List<String> maps2=maps.keySet().stream().filter(c -> c.endsWith("0")).collect(Collectors.toList());
		maps2.forEach(c -> System.out.println(c));
		
		
		
		
	}
}