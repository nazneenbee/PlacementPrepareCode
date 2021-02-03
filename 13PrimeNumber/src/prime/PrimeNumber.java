package prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int count=0;
	
		if(num==1)
		{
			System.out.println("not a prime not a composite");
		}
		else if(num>=2)
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("number is not prime");
			}
			else
			{
				System.out.println("number is prime");
			}
		}

	}

}
