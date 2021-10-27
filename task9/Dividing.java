package task9;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividing {
    public static void div(double nOne, double nTwo) {
        try {
            if (nTwo == 0.0 ){
                throw new DevidingOnNullArithmeticException();
            }
            double res = nOne / nTwo;
            System.out.println(res);
        }
        catch (NumberFormatException e) {
            System.err.println(e);

        } catch (IllegalFormatException e) {
            System.err.println(e);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        } catch (ArithmeticException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
              }
        System.out.println("End deviding...");
    }


    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first double number: ");
            double dOne = scan.nextDouble();
            System.out.print("Enter second double number: ");
            double dTwo = scan.nextDouble();
            div(dOne, dTwo);
        }
        catch (InputMismatchException e) {
            System.err.println("No double number!!! \nTry again!!!");
        }
    }
}
class DevidingOnNullArithmeticException extends ArithmeticException{
}
