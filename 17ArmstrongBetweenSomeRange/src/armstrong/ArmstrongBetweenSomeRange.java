package armstrong;

import java.util.Scanner;

public class ArmstrongBetweenSomeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number who want amstrong");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		//System.out.println(num1);
		int ams;
		int n=num1;
		int rem;
		while(n<num2)
		{
		     ams=0;
		     num1=n;
			while(num1>0)
			{
			    rem=num1%10;
				ams=ams+(rem*rem*rem);
				num1=num1/10;
			}
			if(n==ams)
			{
				System.out.println(n+" is amstrong number");
			}
			n++;
			
		}
	}

}
