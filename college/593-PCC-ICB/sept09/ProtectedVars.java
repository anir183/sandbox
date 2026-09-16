// write a program to create a class named vehicle having protected instance
// variables regnNo, speed, color, ownerName and a method showData() to show a
// message "This is a vehicle class". Inherit the vehicle class into sub-class
// named as Bus and Car having individual private instance variables routeNo
// and manufacturerName respectievely. showData() should display all content of
// both inherited classes.

package sept09;

import java.util.Scanner;

class Vehicle {
	String regNo;
	int speed;
	String color;
	String ownerName;

	Vehicle(String regNo, int speed, String color, String ownerName) {
		this.regNo = regNo;
		this.speed = speed;
		this.color = color;
		this.ownerName = ownerName;
	}

	void showData() {
		System.out.println("\tRegistration No: " + regNo);
		System.out.println("\tSpeed: " + speed);
		System.out.println("\tColor: " + color);
		System.out.println("\tOwner Name: " + ownerName);
	}
}

class Bus extends Vehicle {
	int routeNo;

	Bus(String regNo, int speed, String color,
		String ownerName, int routeNo) {

		super(regNo, speed, color, ownerName);
		this.routeNo = routeNo;
	}

	void showData() {
		super.showData();
		System.out.println("Route No: " + routeNo);
	}
}

class Car extends Vehicle {
	String manufacturerName;

	Car(String regNo, int speed, String color,
		String ownerName, String manufacturerName) {

		super(regNo, speed, color, ownerName);
		this.manufacturerName = manufacturerName;
	}

	void showData() {
		super.showData();
		System.out.println("\tManufacturer Name: " + manufacturerName);
	}
}

public class ProtectedVars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bus Details");

		System.out.print("\tEnter Registration No: ");
		String bRegNo = sc.nextLine();

		System.out.print("\tEnter Speed: ");
		int bSpeed = sc.nextInt();
		sc.nextLine();

		System.out.print("\tEnter Color: ");
		String bColor = sc.nextLine();

		System.out.print("\tEnter Owner Name: ");
		String bOwner = sc.nextLine();

		System.out.print("\tEnter Route No: ");
		int routeNo = sc.nextInt();
		sc.nextLine();

		Bus bus = new Bus(bRegNo, bSpeed, bColor, bOwner, routeNo);

		System.out.println("\nEnter Car Details");

		System.out.print("\tEnter Registration No: ");
		String cRegNo = sc.nextLine();

		System.out.print("\tEnter Speed: ");
		int cSpeed = sc.nextInt();
		sc.nextLine();

		System.out.print("\tEnter Color: ");
		String cColor = sc.nextLine();

		System.out.print("\tEnter Owner Name: ");
		String cOwner = sc.nextLine();

		System.out.print("\tEnter Manufacturer Name: ");
		String manufacturerName = sc.nextLine();

		Car car = new Car(cRegNo, cSpeed, cColor, cOwner, manufacturerName);

		System.out.println("BUS DETAILS");
		bus.showData();

		System.out.println("CAR DETAILS");
		car.showData();

		sc.close();
	}
}
