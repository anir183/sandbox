package d_0930.p20_lexicographical_str_comp;

import java.util.Scanner;

public class StrCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string A: ");
        String a = sc.nextLine();
        System.out.println("Enter string B: ");
        String b = sc.nextLine();

        System.out.println();

        sc.close();

        if (a.length() != b.length()) {
            System.out.println("A and B are NOT Lexicographically Equal");
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                System.out.println("A and B are NOT Lexicographically Equal");
                return;
            }
        }

        System.out.println("A and B are Lexicographically Equal");
    }
}
