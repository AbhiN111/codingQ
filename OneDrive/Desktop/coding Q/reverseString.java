import java.util.*;

public class reverseString {
    public static String stringReverse(String s){
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for(int i=n-1; i>=0;i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();

        //Apporach 2
        // char[] arr = s.toCharArray();

        // int left = 0;
        // int right = arr.length - 1;

        // while (left < right) {
        //     char temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;
        // }

        // return new String(arr);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = stringReverse(s);

        System.out.println("Reversed string: " + result);
        
    }
}
