import java.util.*;

public class stringPalindrome {
    public static boolean palindromeString(String s){
        int n = s.length();

        int left= 0;
        int right=n-1;

        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;

        // //Approach 2: Reverse the string and compare
        // String reverse = new StringBuilder(s).reverse().toString();
        // return s.equals(reverse);

        // //Approach 3: Using a char[] 
        // char[] arr = s.toCharArray();

        // int left = 0;
        // int right = arr.length - 1;

        // while (left < right) {
        //     if (arr[left] != arr[right]) {
        //         return false;
        //     }

        //     left++;
        //     right--;
        // }

        // return true;

        // //Approach 4: Recursion — good for learning recursion
        //  if (left >= right) {
        // return true;
        // }

        // if (s.charAt(left) != s.charAt(right)) {
        //     return false;
        // }

        // return palindromeString(s, left + 1, right - 1);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s= sc.next();

        boolean result = palindromeString(s);

        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is Not a palindrome");
        }
        
    }
}
