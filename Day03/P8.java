import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 angles : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b+c == 180){
            System.out.print("Triangle");
        }
        else{
            System.out.print("Not a Triangle");
        }

        sc.close(); 
    }
}
