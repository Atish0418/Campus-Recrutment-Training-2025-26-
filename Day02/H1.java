// WAP to calculate area and circumference of circle. Assume radius to be an integer and it any value of your choice.
public class H1{
    public static void main(String[] args) {
        int r = 7;

        double area = Math.PI * Math.pow(r,2);
        double circumference = 2*Math.PI*r;

        System.out.println("Area of circle : "+area);
        System.out.println("circumference of circle : "+circumference);

    }
}