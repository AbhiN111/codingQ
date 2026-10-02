import java.util.*;

public class numberPalindrome {
    public static boolean palindromeNumber(int n){
        int orginal = 0;
        int reverse = n-1;

        while(n>0){
            int digit= n%10;
            reverse= reverse*10 + digit;
            n=n/10;
        }
        return true;

        // //1. Reverse only half
        // if (n < 0 || (n % 10 == 0 && n != 0)) {
        //     return false;
        // }

        // int reverseHalf = 0;

        // while (n > reverseHalf) {
        //     reverseHalf = reverseHalf * 10 + n % 10;
        //     n /= 10;
        // }

        // return n == reverseHalf || n == reverseHalf / 10;
        
        // //2.Convert to String
        // String s = String.valueOf(n);

        // int left = 0;
        // int right = s.length() - 1;

        // while (left < right) {
        //     if (s.charAt(left) != s.charAt(right)) {
        //         return false;
        //     }

        //     left++;
        //     right--;
        // }

        // return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (palindromeNumber(n)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
