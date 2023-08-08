package runner;

import com.xworkz.Interface.inter.Address;

import things.BusNumber;
import things.BusRoute;
import things.BusStopName;
import things.BusType;
import things.Color;
import things.Conductors;
import things.Cost;
import things.Drivers;
import things.Login;
import things.Logout;
import things.MaintenanceDep;
import things.Owners;
import things.PanNumber;
import things.PassengersList;
import things.Portal;
import things.Register;
import things.Seats;
import things.TicketCounter;
import things.Timings;

public class BusNumberRunner {
	public static void main(String[] args) {
		
		Address bus = new BusNumber();
		BusStopName bus1 = new BusNumber();
		Color bus2 = new BusNumber();
		
		Conductors name1 = new BusRoute();
		Cost name2 = new BusRoute();
		Drivers name3 = new BusRoute();
		
		Login type1 = new BusType();
		Logout type2 = new BusType();
		MaintenanceDep type3 = new BusType();
		
		Owners bmtc = new Portal();
		PanNumber bmtc1 = new Portal();
		PassengersList bmtc2 = new Portal();
		
		Seats ticket = new TicketCounter();
		Register ticket1 = new TicketCounter();
		Timings ticket2 = new TicketCounter();
	}

}
