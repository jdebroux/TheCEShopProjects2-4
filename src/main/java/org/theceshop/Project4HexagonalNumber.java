package org.theceshop;

public class Project4HexagonalNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);
        int hexagonalNumber = n * (2 * n - 1);

        System.out.println("The " + n + "th hexagonal number is " + hexagonalNumber);
    }
}