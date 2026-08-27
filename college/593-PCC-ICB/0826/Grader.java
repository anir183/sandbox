// use a constructor letterGrader and make a method getGrade inside which to
// calculate the grade of a student in an exam, where input is marks obtained in
// a subject. check first if the marks is negative or greater than 100 or not.
// print the grade obtained for each subject corresponding to the marks. do this
// for N subjects and calculate the SGPA of the student and print it. now do
// this for 5 students in total.

import java.util.Scanner;

public class Grader {
	public static void main(String[] args) {
		LetterGrader[] input = new LetterGrader[2];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < input.length; i++) {
			input[i] = new LetterGrader("Student " + (i + 1), sc);
			input[i].getGrades();
			input[i].calculateSGPA();
			input[i].display();
		}

		sc.close();
	}
}

class LetterGrader {
	String name;
	int[] marks;
	char[] grades;
	float sgpa;

	LetterGrader(String n, Scanner sc) {
		name = n;

		System.out.println("Input marks for: " + name);
		System.out.print("Number of subjects: ");
		marks = new int[sc.nextInt()];

		for(int i = 0; i < marks.length; i++) {
			System.out.print("\tSub " + (i + 1) + ": ");
			marks[i] = sc.nextInt();

			if(!isValidMarks(marks[i])) {
				System.out.println("\tInvalid Input. Retry!");
				i--;
				continue;
			}
		}
		System.out.println();
	}

	void getGrades() {
		grades = new char[marks.length];
		for(int i = 0; i < grades.length; i++) {
			grades[i] = marksToGrade(marks[i]);
		}
	}

	void calculateSGPA() {
		for(int i = 0; i < marks.length; i++) {
			sgpa += marks[i] / 10f;
		}
		sgpa /= marks.length;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Subj\t| Marks\t| Grade");
		for(int i = 0; i < marks.length; i++) {
			System.out.println((i + 1) + "\t| " + marks[i] + "\t| " + grades[i]);
		}
		System.out.println("SGPA: " + sgpa);
		System.out.println();
	}

	static boolean isValidMarks(int m) {
		return (m <= 100) && (m >= 0);
	}

	static char marksToGrade(int m) {
		switch(m / 10) {
			case 10: return 'O';
			case 9: return 'O';
			case 8: return 'E';
			case 7: return 'A';
			case 6: return 'B';
			case 5: return 'C';
			case 4: return 'D';
			default: return 'F';
		}
	}
}
