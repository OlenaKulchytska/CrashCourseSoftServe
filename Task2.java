import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = scan.nextInt();
        int n1 = n;
        // Чи входить число 3 в запис n^2
        System.out.println("Task a. Num 3 in n^2.");
        int sguare = n * n;
        String s = Integer.toString(sguare);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = sguare % 10;
            sguare /= 10;
        }
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 3) temp++;
        }
        if (temp == 0) System.out.println("Не містить 3!");
        else System.out.println("Містить 3!");
        // Поміняти порядок цифр числа n на протилежний
        System.out.println("Task b. The opposite order of numbers in the number.");
        String s1 = Integer.toString(n);
        int[] arr1 = new int[s1.length()];
        for (int i = s1.length() - 1; i >= 0; i--) {
            arr1[i] = n % 10;
            n /= 10;
        }
        for (int i = arr1.length - 1; i>=0; i--){
            System.out.print(arr1[i]);
        }
        // Переставити першу і останню цифру числа n
        System.out.println("\nTask c. Rearrange the first and last digit of the number.");
        char[] charN = String.valueOf(n1).toCharArray();
        char[] charN1 = String.valueOf(n1).toCharArray();
        char tmp = charN[0];
        charN[0] = charN[charN.length - 1];
        charN[charN.length - 1] = tmp;
        System.out.println(charN);
        // Дописати по одиниці до початку та вкінець числа n
        System.out.println("Task d. Add one to the beginning and end of the number.");
        char[] numWithOne = new char[charN1.length+2];
        numWithOne[0] = '1';
        numWithOne[numWithOne.length - 1] = '1';
        for (int i = 1; i <= numWithOne.length - 2; i++) {
            numWithOne[i] = charN1[i-1];
        }
        System.out.println(numWithOne);
    }
}
