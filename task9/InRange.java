package task9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InRange {
    public static void readNumber(int start, int end){
        Scanner scan = new Scanner(System.in);
        int n[] = new int[10];

        for (int i = 0; i<n.length; i++) {
            try {
                System.out.print("Enter int number: ");
                n[i] = scan.nextInt();
                if (n[i]<=end && n[i]>=start);
                else {
                    System.err.println("\n"+ n[i] + " is not in range!!!");
                    n[i] =-2147483648;
                    continue;
                }
            }
            catch (InputMismatchException e){
                System.err.println("\nNo int number!!! \nTry again!!!");
                for (int j = i; j< n.length; j++) {
                    n[j] = -2147483648;
                }
                break;
            }

        }
        Arrays.sort(n);
        System.out.print(start);
        for (int i = 0; i<n.length; i++) {
            if (n[i] != -2147483648) System.out.print(" < " + n[i] + " ");
        }
        System.out.print(" < " +end);

    }

    public static void main(String[] args) {
        readNumber(1, 100);
    }
}
