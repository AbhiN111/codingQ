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

        // //1.Using StringBuilder
        // boolean negative = n < 0;

        // String s = String.valueOf(Math.abs(n));

        // String reverse = new StringBuilder(s).reverse().toString();

        // int result = Integer.parseInt(reverse);

        // return negative ? -result : result;

        // //2. Recursive approach
        //  if (n == 0) {
        // return reverse;
        // }

        // int digit = n % 10;
        // reverse = reverse * 10 + digit;

        // return integerReverse(n / 10, reverse);

    //     //3. If this is for LeetCode / interviews
    //     int reverse = 0;

    //     while (n != 0) {
    //         int digit = n % 10;

    //         if (reverse > Integer.MAX_VALUE / 10 ||
    //             (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
    //             return 0;
    //         }

    //         if (reverse < Integer.MIN_VALUE / 10 ||
    //             (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
    //             return 0;
    //         }

    //         reverse = reverse * 10 + digit;
    //         n /= 10;
        //     }

        // return reverse;
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
