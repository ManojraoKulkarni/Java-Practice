import java.util.*;

public class functions{

    public static void calculateFactorial(int n){
        if( n <0){
            System.out.println("Invalid Number. Enter the positive number to calculate Factorial");
        }
        int factorial =1;
        for(int i=n; i>=1; i--){
             factorial = factorial * i ;
        
        }
        System.out.println("The factorial of "+n+" is "+factorial);
       // return factorial;
        //sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial :");
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}