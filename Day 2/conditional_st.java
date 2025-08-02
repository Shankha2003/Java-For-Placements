import java.util.*;

public class conditional_st {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your age: ");
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("You are a Senior.");
        } else if (age >= 18) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are not an Adult.");
        }

        sc.close();
    }
}
