package primebetweenrange;

import java.util.Scanner;

public class PrimeBetweenSomeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number you want prime between number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count=0;
		System.out.println("prime number are between range");
		while(num1<=num2)
		{
			count=0;
			for(int i=2; i<num1; i++)
			{
				if(num1%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(num1);
			}
			num1++;
		}

	}

}
