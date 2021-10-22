package task3;
import java.util.Scanner;

public class Task3 {

    public static void flowerBed() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of flower bed: ");
        float r = scan.nextFloat();
        double pi = 3.1415;
        double perimetr = 2 * pi * r;
        System.out.println("The perimetr of flower bed: " + perimetr);
        double area = pi * r * r;
        System.out.println("The area of flower bed: " + area);
    }

    public static void personalInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.print("Where are you live, " + name + "? ");
        String address = scan.nextLine();
        System.out.println("--All information--" + "\nName: " + name + "\nAddress: " + address);
    }
    public static void calls() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Click enter after each number!");
        System.out.print("The cost of call in your country (standard units per minute): \n");
        double c1 = scan.nextDouble();
        double c2 = scan.nextDouble();
        double c3 = scan.nextDouble();
        System.out.print("The time of calls are: \n");
        double t1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double t3 = scan.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        System.out.println("The cost of 1 call is " + cost1 + " standard units");
        System.out.println("The cost of 2 call is " + cost2 + " standard units");
        System.out.println("The cost of 3 call is " + cost3 + " standard units");
        System.out.println("The sum is " + (cost1+cost2+cost3) + " standard units");
    }
    public static void calls1() {
        Scanner input = new Scanner(System.in);
        double[] c = new double[3];

        Scanner scan = new Scanner(System.in);
        double[] t = new double[3];

        for (int i = 0; i < c.length; i++) {
            System.out.println("The cost of call in your country (standard units per minute): ");
            c[i] = input.nextDouble();
        }

        for (int i = 0; i < t.length; i++) {
            System.out.println("The time of calls are: ");
            t[i] = scan.nextDouble();
        }
        double[] cost1 = new double[3];
        for (int i = 0; i < t.length; i++) {
            cost1[i] = c[i] * t[i];
            System.out.println("The cost of " + (i + 1)  + " call is " + cost1[i] + " standard units");
        }
        double sum = 0;
        for (int i = 0; i < cost1.length; i++) {
            sum += cost1[i];
        }
        System.out.println("The sum is " + sum + " standard units");

    }
    public static void main(String[] args) {
        System.out.println("Task 3.1");
        flowerBed();
        System.out.println("Task 3.2");
        personalInfo();
        System.out.println("Task 3.3.a");
        calls();
        System.out.println("Task 3.3.b");
        calls1();
    }
}
