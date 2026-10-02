import java.util.*;

public class revserseInteger {
    public static int integerReverse(int n){
        int reverse=0;

        while(n!=0){
            int digit = n%10;
            reverse=reverse*10+digit;
            n =n/10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = integerReverse(n);

        System.out.println("Reversed integer: " + result);

        sc.close();
    }
    
}
