import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(!Character.isLetter(ch)){
            
        }
            if(Character.isLowerCase(ch)){
                System.out.print("LOWERCASE");
            }
            else if(Character.isDigit(ch)){
                System.out.println("You entered digit");
            }
            else if(Character.isUpperCase(ch)){
                System.out.println("UPPERCASE");
            }
            else{
                System.out.println("Enter a valid character");
            }
    }
}
