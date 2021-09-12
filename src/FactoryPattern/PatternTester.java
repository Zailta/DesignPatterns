package FactoryPattern;

import java.util.Scanner;

public class PatternTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactoryPattern factoryPattern = new FactoryPattern();
        Calculate calobject = factoryPattern.getCalculation(sc.next());
        calobject.calculate(5,10);

    }
}
