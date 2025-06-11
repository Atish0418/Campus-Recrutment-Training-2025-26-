// WAP to calculate the hypotheneous of a right triangle with the help of Math class 

public class H2 {
    public static void main(String[] args) {
        int side1 = 4; // perpendicular
        int side2 = 5; // base

        double h = Math.sqrt(Math.pow(side1,2) + Math.pow(side2, 2)); // hypotheneous

        System.out.println("Hypotheneous of " +side1+ " and "+side2+ " is "+h);
    }
}
