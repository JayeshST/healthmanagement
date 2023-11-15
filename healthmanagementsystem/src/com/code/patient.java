package com.code;

import java.io.Serializable;
import java.time.LocalDate;

public class patient implements Comparable<patient>,Serializable {

	
	private int serialno,age;
	private String name,gender,address,phoneno,disease;
	private LocalDate admitdate;
	private double bill,income;
	private roomtype rooms;
	private static int idcounter;
	static {
		idcounter=1;
	}
	public patient(int serialno, int age, String name, String gender, String address, String phoneno, String disease,
			LocalDate admitdate, double bill, double income, String rooms) {
		super();
		this.serialno = idcounter++;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneno = phoneno;
		this.disease = disease;
		this.admitdate = admitdate;
		this.bill = bill;
		this.income = income;
		this.rooms = roomtype.valueOf(rooms);
	}
	
	//for duplication check
	
	public patient(String phoneno) {
	 this.phoneno=phoneno;
		
	}
	
	public patient(int serialno) {
		this.serialno=serialno;
	}
	
	
	

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public LocalDate getAdmitdate() {
		return admitdate;
	}

	public void setAdmitdate(LocalDate admitdate) {
		this.admitdate = admitdate;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public roomtype getRooms() {
		return rooms;
	}

	public void setRooms(roomtype rooms) {
		this.rooms = rooms;
	}

	public static int getIdcounter() {
		return idcounter;
	}

	public static void setIdcounter(int idcounter) {
		patient.idcounter = idcounter;
	}

	@Override
	public String toString() {
		return "serialno= " + serialno +
				"\n, age= " + age +
				"\n, name= " + name + 
				"\n, gender= " + gender + ",\n"
				+ " address= "+ address + 
				"\n, phoneno= " + phoneno + 
				"\n, disease= " + disease + 
				"\n, admitdate= " + admitdate 
				+ "\n, bill= "
				+ bill + "\n, income= " + income +
				"\n, rooms= " + rooms + "";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof patient) {
			patient p1=(patient)obj;
			return this.phoneno.equals(p1.phoneno);
//			return this.serialno==p1.serialno;
		}
		return false;
	}

	@Override
	public int compareTo(patient o) {
		System.out.println("compare to");
		return this.phoneno.compareTo(o.phoneno);
	}
	
	
	
	
}
