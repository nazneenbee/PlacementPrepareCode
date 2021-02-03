package swapnumber;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number decimal number");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("Before swapping number are : ");
		System.out.println(a);
		System.out.println(b);
		float temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping number are : ");
		System.out.println(a);
		System.out.println(b);

	}

}
