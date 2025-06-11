// Farenhit to celcius degree

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Farenhit : ");
        int F = sc.nextInt(); 

        float C = (5*(F-32)/9);

        System.out.println("Farenhit "+F+ " to celcius is " +C);
    }
}
