package palindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int rem;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int n1=num;
        while(num>0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }
        if(n1==rev)
        {
        	System.out.println("number is palindrome");
        }
        else
        {
        	System.out.println("number is not palindrome");
        }
      
	}

}
