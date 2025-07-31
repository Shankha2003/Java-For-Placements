import java.util.*;

public class radiusOfCircle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the radius of the Circle : ");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the Circle is " + area );
     }
}
