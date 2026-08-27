// write a program to print the details of a student (name, phone and roll)

public class StudentData {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.name = "Anirban RoyChowdhury";
		stud.phone = "XXXXXXXXXX";
		stud.roll = "130317XXXXX";
		stud.display();
	}
}

class Student {
	String name;
	String phone;
	String roll;

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
		System.out.println("Roll: " + roll);
	}
}
