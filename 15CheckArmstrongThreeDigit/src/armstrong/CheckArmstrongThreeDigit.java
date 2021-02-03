package armstrong;

import java.util.Scanner;

public class CheckArmstrongThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int n1=num;
		int rem;
		int arms=0;
		while(num>0)
		{
			rem=num%10;
			arms=arms+(rem*rem*rem);
			num=num/10;
		}
		if(n1==arms)
		{
			System.out.println("number is argstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}

	}

}
