import java.util.*;
public class swap
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int sum = 0;
		System.out.println("Enter the number to perform numbers ");
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
        
        System.out.println("Enter "+size+" numbers :");
        if(size == arr.length){
            for(int i = 0; i <= arr.length - 1; i++){
                arr[i] = sc.nextInt();
        }
        }
        for(int i = 0; i <arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("sum " +sum);
       
		
	}
}

