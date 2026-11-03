// write a program to print the details of a student (name, phone and roll)

package d_0819.p03_student_info;

class Student {
    String name;
    String roll_no;
    String phone_no;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll_no);
        System.out.println("Phone No.: " + phone_no);
    }
}

public class StudentResult {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Anirban";
        s1.roll_no = "130317XXXXX";
        s1.phone_no = "98XXXXXX21";
        s1.display();
    }
}
