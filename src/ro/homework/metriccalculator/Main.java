package ro.homework.metriccalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the expression you want to compute distance (i.e. 7m+17cm+271mm), \nthen press enter and insert the desired final unit (i.e. mm, cm, m, km): ");
        Calculator calculator = new Calculator();
        calculator.compute(sc.nextLine(), sc.nextLine());
    }
}
