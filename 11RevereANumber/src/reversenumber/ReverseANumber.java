package reversenumber;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int rem;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        while(num>0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }
        System.out.println(rev);

	}

}
