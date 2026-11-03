package d_0916.p14_student_db_abstraction;

import java.util.Scanner;

public class Student extends Hostel implements Department {
    String studentName;
    long regdNo;
    String electiveSubjects[];
    float avgMarks;

    public void printDeptAttrs() {
        System.out.println("\t\tDept. Name: " + Student.deptName);
        System.out.println("\t\tDept. Head: " + Student.deptHead);
    }

    void getData(Scanner sc) {
        sc.nextLine();

        System.out.print("\tEnter Student Name: ");
        this.studentName = sc.nextLine();

        System.out.print("\tEnter Regd. No.: ");
        this.regdNo = sc.nextLong();

        sc.nextLine();

        System.out.print("\tEnter No. of Subjects: ");
        electiveSubjects = new String[sc.nextInt()];
        int marks[] = new int[electiveSubjects.length];

        for (int i = 0; i < electiveSubjects.length; i++) {
            sc.nextLine();
            System.out.println("\t\tSubject " + (i + 1) + ": ");
            System.out.print("\t\t\tEnter Name: ");
            electiveSubjects[i] = sc.nextLine();
            System.out.print("\t\t\tEnter Marks: ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        this.avgMarks = (float) sum / marks.length;

        super.getHostelAttrs(sc);
    }

    void printData() {
        System.out.println("\tStudent Information");
        System.out.println("\t\tStudent Name: " + this.studentName);
        System.out.println("\t\tRegd. No.: " + this.regdNo);
        System.out.println("\t\tElective Subjects: ");
        for (int i = 0; i < electiveSubjects.length; i++) {
            System.out.println("\t\t\t" + electiveSubjects[i]);
        }
        System.out.println("\t\tAverage Marks: " + this.avgMarks);
        System.out.println("\tHostel Information");
        printHostelAttrs();
        System.out.println("\tDept. Information");
        printDeptAttrs();
    }
}
