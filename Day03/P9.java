//  calculate the total electricity bill

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your electricity unit : ");
        int unit = sc.nextInt();

        double amount = 0;

        if(unit >250){
            amount += (unit - 250) * 1.50 + 50*0.50 + 100*1.20 + 100*0.75;
        }
        else if(unit>150 && unit<=250){
            amount += (unit - 150) * 1.20 + 100*0.75 + 50*0.50;
        }
        else if(unit>50 && unit<=150){
            amount += (unit - 50)*0.75 + 50*0.50;
        }
        else{
            amount += 50 * 0.50;
        }

        // 20% surcharge
        double surcharge = amount * 0.20;
        double totalAmount = amount + surcharge;

        // rounded 2 decimal places
        System.out.println("Total bill: %.2f\n"+totalAmount);
    
        sc.close();
    }
}
