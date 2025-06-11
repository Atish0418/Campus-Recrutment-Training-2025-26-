// Check whether the given character is an alphabet or a number or a special character

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch)){
            System.out.print("It is an alphabet");
        }
        else if(Character.isDigit(ch)){
            System.out.print("It is a number");
        }
        else{
            System.out.println("Spaecial character");
        }
    }
}
