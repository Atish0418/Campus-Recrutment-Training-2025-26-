// using Math function => radius and height is given
public class P1 {
    public static void main(String[] args) {
        int r = 4;
        int h = 5;

        double area = 2*Math.PI*r*h;
        double volume = Math.PI*Math.pow(r, 2)*h;
        double tsa = 2*Math.PI*r*(r+h);
        
        System.out.println("Area of cylinder : " +area);
        System.out.println("volume : "+volume);
        System.out.println("Total Surface Area : " +tsa);
    }
}
