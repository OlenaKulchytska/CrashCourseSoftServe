package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void task1() {

        Scanner input = new Scanner(System.in);
        float[] numbers = new float[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Print float number: ");
            numbers[i] = input.nextFloat();
        }
        System.out.println("Array: ");
        for (float number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        //Task 1.1 In range [-5;5]
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>=-5 && numbers[i]<=5) System.out.println(numbers[i] + " is in range");
            else System.out.println(numbers[i] + " is not in range");
        }
        //Task 1.2 Max and Min values
        Arrays.sort(numbers);
        System.out.println("Min = " + numbers[0]);
        System.out.println("Max = " + numbers[numbers.length-1]);


    }
    public enum Error {
        BadRequest, Unauthorised, PaymentRequired, Forbidden
    }
    public static void task1_3() {
        System.out.println("Type the number of HTTP error: ");
        Scanner sc = new Scanner(System.in);
        int error = sc.nextInt();
        switch (error) {
            case 400:
                System.out.println(Error.BadRequest);
                break;
            case 401:
                System.out.println(Error.Unauthorised);
                break;
            case 402:
                System.out.println(Error.PaymentRequired);
                break;
            case 403:
                System.out.println(Error.Forbidden);
                break;
            default:
                System.out.println("Bad number!!!!!");
        }
    }

    public static void main(String[] args) {
        //task1();
        task1_3();
    }
}
