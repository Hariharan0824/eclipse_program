package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.OperatingSystem;

public class OperatingSystemRunner {
	public static void main(String args[]) {
		OperatingSystem os1=new OperatingSystem();
		
		OperatingSystem os2=new OperatingSystem();
		os2.name="Windows";
		os2.type="Computer Operating system";
		os2.developedBy="Microsoft Corporation";
		os2.founder="Bill Gates";
		os2.firstVersion="Windows MS-DOS";
		os2.released="1985";
		os2.latestVersion="Windows 11";
		os2.releasedOn="2021";
		os2.versions=46;
		os2.functions="Memory management";
		
		System.out.println("Name of OS:"+os2.name);
		System.out.println("Type of OS:"+os2.type);
		System.out.println("Deveeloped by:"+os2.developedBy);
		System.out.println("Founder:"+os2.founder);
		System.out.println("First Version:"+os2.firstVersion);
		System.out.println("Released in:"+os2.released);
		System.out.println("Latest Version:"+os2.latestVersion);
		System.out.println("Released on:"+os2.releasedOn);
		System.out.println("Number of versions till now:"+os2.versions);
		System.out.println("Functions:"+os2.functions);
	}
}
