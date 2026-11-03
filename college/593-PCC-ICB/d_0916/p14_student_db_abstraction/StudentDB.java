package d_0916.p14_student_db_abstraction;

import java.util.Scanner;

public class StudentDB {
    Scanner sc;
    static String homeState = "wb";

    Student store[] = {};
    int top = -1;

    StudentDB(Scanner sc) {
        this.sc = sc;

        System.out.print("Enter Student DB Capcity: ");
        store = new Student[sc.nextInt()];
        top = 0;
    }

    void insert() {
        if (top >= store.length) {
            System.out.println("Max Capacity Reached");
            return;
        }

        System.out.println("Eligibility Verification");
        System.out.print("\tEnter 10th Marks: ");
        if (sc.nextInt() < 80) {
            System.out.println("Not Eligible for Admission");
            return;
        }

        System.out.print("\tEnter 12th Marks: ");
        if (sc.nextInt() < 80) {
            System.out.println("Not Eligible for Admission");
            return;
        }

        System.out.print("\tEnter Rank: ");
        if (sc.nextInt() > 900) {
            System.out.println("Not Eligible for Admission");
            return;
        }

        System.out.println("Eligible for Admission\n\nStudent Admission Details");

        Student newStudent = new Student();
        newStudent.getData(sc);

        store[top++] = newStudent;

        System.out.println("Admitted New Student");
    }

    void migrate() {
        sc.nextLine();

        System.out.print("\tEnter your State: ");
        String state = sc.nextLine();

        if (state.trim().equalsIgnoreCase(homeState)) {
            System.out.println("Migration NOT Needed");
        } else {
            System.out.println("Migration Needed");
        }
    }

    void fetch() {
        System.out.print("\tEnter Regd. No.: ");
        long regdNo = sc.nextLong();

        System.out.println();
        for (int i = 0; i < top; i++) {
            if (store[i].regdNo == regdNo) {
                store[i].printData();
                break;
            }
        }
    }
}
