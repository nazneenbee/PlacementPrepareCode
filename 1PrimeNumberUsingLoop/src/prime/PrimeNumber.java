package prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want to check prime or not");
         int num=sc.nextInt();
         int count=0;
         for(int i=2; i<num; i++)
         {
        	if(num%i==0) {
        		count++;
        	}
         }
         if(count==0)
         {
        	 System.out.println("number is prime number");
         }
         else
         {
        	 System.out.println("number is not prime number");
         }
	}

}
