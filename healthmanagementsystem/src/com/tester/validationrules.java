package com.tester;

import java.time.LocalDate;
import java.util.List;

import com.code.patient;
import com.code.roomtype;

public class validationrules {

	// enum validation
	public static roomtype parseroom(String rooms, double bill) throws invalidexception {
		if (!(roomtype.valueOf(rooms).getCost() == bill)) {
			throw new invalidexception("not match price");
		}

		return roomtype.valueOf(rooms.toUpperCase());
		
	}
	
	//validate localdate
	public static LocalDate parsedate(String admitdate)throws invalidexception{
		
		LocalDate d1=parsedate(admitdate);
		LocalDate chkdate=LocalDate.of(2001, 01, 01);
		if(d1.isBefore(chkdate)) {
			throw new invalidexception("no match date");
		}
		
		return d1;
	}

	
	
	
	
	
	
	
	
	
	//validation all
	
	public static patient inputall(int serialno, int age, String name, String gender, String address, String phoneno, String disease,
			String admitdate, double bill, double income, String rooms,List<patient>list)throws invalidexception{
				
		roomtype r1=parseroom(rooms,bill);
		LocalDate d1=LocalDate.parse(admitdate);
		LocalDate date=LocalDate.now();
	
		
		return new patient(serialno, age, name, gender, address, phoneno, disease, d1, bill, income, rooms);
		
		
		
		
		
		
	}
	
	
	
	
}
