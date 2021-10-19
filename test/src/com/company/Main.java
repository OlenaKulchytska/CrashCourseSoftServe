package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = scan.nextDouble();
        System.out.print("Enter number b: ");
        double b = scan.nextDouble();
        System.out.print("Enter number c: ");
        double c = scan.nextDouble();
        System.out.print("Enter number x: ");
        double x = scan.nextDouble();
        System.out.print("Enter number y: ");
        double y = scan.nextDouble();
        // Closing Scanner after the use
        scan.close();
        if (a<x && b<y) {
            System.out.println("Цегла пройде)");
        } else if (a<y && b<x) {
            System.out.println("Цегла пройде)");
        } else if (c<y && a<x) {
            System.out.println("Цегла пройде)");
        }else if (c<x && b<y) {
            System.out.println("Цегла пройде)");
        }
        else if (c<y && b<x) {
            System.out.println("Цегла пройде)");
        }else {
            System.out.println("Цегла не пройде(");
        }
    }
}
