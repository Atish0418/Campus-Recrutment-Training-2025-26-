// Digit Puzzle Game
public class P4 {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }

        while(sum >=10){
            n = sum;
            sum = 0;
            while(n>0){
                int rem = n%10;
                sum = sum + rem;
                n = n/10;
            }
        }

        if(sum % 2 == 0){
            System.out.println(sum);
        }
        else{
            System.out.println(Math.pow(sum, 2));
        }

        
    }
}
