package d_0916.p14_student_db_abstraction;

import java.util.Scanner;

public class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    public void getHostelAttrs(Scanner sc) {
        System.out.print("\tEnter Hostel Name: ");
        sc.nextLine();
        this.hostelName = sc.nextLine();
        System.out.print("\tEnter Hostel Location: ");
        this.hostelLocation = sc.nextLine();
        System.out.print("\tEnter Number of Rooms: ");
        this.numberOfRooms = sc.nextInt();
    }

    public void printHostelAttrs() {
        System.out.println("\t\tHostel Name: " + this.hostelName);
        System.out.println("\t\tHostel Location: " + this.hostelLocation);
        System.out.println("\t\tNumber of Rooms: " + this.numberOfRooms);
    }
}
