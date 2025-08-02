import java.util.*;

public class equal_or_not_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int x = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int y = sc.nextInt();

        if(x == y){
            System.out.println("They are equal Numbers . ");
        }else{
            System.out.println("They are not equal Numbers . ");
        }
    }
    
}
