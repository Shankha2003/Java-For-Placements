import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a Number");

        int x = sc.nextInt();

        if(x%2 == 0){
            System.out.println("It's a even number. ");
        }else{
            System.out.println("It's an odd number . ");
        }
    } 
}
