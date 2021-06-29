package exam2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputText);
        System.out.println("Result: ");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
