package com.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.tester.validationrules.inputall;
import com.code.patient;
import com.code.roomtype;

public class tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<patient> pati = new ArrayList<>();

			boolean exit = false;
			while (!exit) {

				System.out.println("Enter choice= 1 add patient records \n 2 dispaly all patient records \n "
						+ " 8 sort patient as per gender    9 Serialization \n 10 deserialization \n " + " ");

				try {

					switch (sc.nextInt()) {

					case 1:
						// add patient records
						System.out.println(
								"Enter patients details =   (int serialno, int age, String name, String gender, String address, String phoneno, String disease,\r\n"
										+ "			String admitdate, double bill, double income, String rooms,List<patient>list");
						patient p1 = inputall(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next(), pati);
						pati.add(p1);
						System.out.println("Records added....");

						break;

					case 2:
						// display all patient details
						for (patient p : pati) {
							System.out.println(p);
						}

						break;

					case 3:

						// display all the patient who has annualIncome < 30000
					
						pati.stream().filter(i -> i.getIncome() < 30000).forEach(i -> System.out.println(i));
						break;

					case 4:

						// display all the patient details of room type chosen from the user.
						System.out.println("Enter room type=");
						roomtype s = roomtype.valueOf(sc.next());
						pati.stream().filter(i -> i.getRooms().equals(s)).forEach(i -> System.out.println(s));

						break;

					case 5:
						// Remove all the patient who has disease “Diabetese”.
					

						pati.stream().filter(i -> i.getDisease().equals("diabetese"))
								.forEach(i -> System.out.println(i));

						break;

					case 6:

							//change icu to special 				
						for (patient p : pati) {
							if (p.getRooms().equals(roomtype.valueOf("IcU"))) {
								p.setRooms(roomtype.valueOf("SPECIAL"));
							}
						}
						break;

					case 7:
						pati.stream().filter(i -> i.getAge() > 75).forEach(i -> System.out.println(i));

						break;

					case 8:
						// sort per gender
						pati.stream().filter(i -> i.getGender().equals("male")).sorted()
								.forEach(i -> System.out.println(i));
						break;

					case 9:
						// for serialization
						System.out.println("Enter file name=");
						com.tester.serial.encoder(pati, sc.next());
						break;

					case 10:
						// for deserialization
						System.out.println("Enter file name=");
						List<patient> list = com.tester.serial.decoder(sc.next());
						System.out.println(list);
						break;

					}

				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
					sc.nextLine();

				}
			}

		}

	}

}
