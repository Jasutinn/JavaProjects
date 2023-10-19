package jasutinn;

import java.util.Scanner;

public class char_Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a series of characters: ");
        String input = scanner.nextLine(); // Read the input string

        for (int i = 0; i < input.length(); i++) {
            String currentChar = input.substring(i, i + 1);
            System.out.println("String " + (i + 1) + ": " + currentChar);
        }

        scanner.close();
    }
}
