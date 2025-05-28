import java.util.*;
 public class CLASS{
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        SUM s = new SUM();

        System.out.print("Enter the value of a :");
        int a =sc.nextInt();

        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
         s.sum(a,b);
     } }
       class SUM {
         void sum(int a, int b){
             //int a = 9, b = 4; // int a ,b; 
             int s= a +b ; 
             System.out.println("The sum of "+a+" and "+b+" is "+s); } }