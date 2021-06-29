package exam2;

import exam2.entity.ConversionUtil;


import java.util.Scanner;
import java.util.StringTokenizer;

public class MainThread {
    public static void main(String[] args) {
        ConversionUtil conversionUtil = new ConversionUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        System.out.println("Result: ");
        System.out.println(conversionUtil.converse(inputText));
    }
}
