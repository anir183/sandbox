package d_0916.p14_student_db_abstraction;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDB db = new StudentDB(sc);

        System.out.println();
        menu();

        int i = 0, ch;
        while (i < 100) {
            System.out.print("\n> ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    db.insert();
                    break;
                case 2:
                    db.migrate();
                    break;
                case 3:
                    db.fetch();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    menu();
            }

            i++;
        }
    }

    static void menu() {
        System.out.println("Choose:");
        System.out.println("\t1. Admit New Student");
        System.out.println("\t2. Migration Check");
        System.out.println("\t3. Display Student Details");
    }
}
