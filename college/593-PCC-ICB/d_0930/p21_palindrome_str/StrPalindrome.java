package d_0930.p21_palindrome_str;

import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();

        sc.close();

        System.out.println();

        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }

        if (rev.equals(str)) {
            System.out.println("Input string is Palindrome");
        } else {
            System.out.println("Input string is NOTE Palindrome");
        }
    }
}
