import java.util.*;

public class numberIsPrime {
    public static int primeNmber(int n){
        // int count=0;

        // for(int i =1; i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
            
        // }
        // return count;

        //Approach 2;
        int count =0;
        for(int i =1; i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n =sc.nextInt();

        int result = primeNmber(n);
        if(result==2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
