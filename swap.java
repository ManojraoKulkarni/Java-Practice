import java.util.*;
public class swap {
    public static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The two numbers after swaping are a :"+a +" and "+b);

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two number to swap :");
    System.out.println("Enter the value of a :");
    int a = sc.nextInt();
    System.out.println("Enter the value of b :");
    int b = sc.nextInt();
    System.out.println("The two numbers before swaping are a :"+a+" and b :"+b);
    swap(a,b);

    
    

     
    
    }
}
