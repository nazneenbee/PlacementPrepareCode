package checknum;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num>0)
        {
        	System.out.println("number is positive");
        }
        else if(num<0)
        {
        	System.out.println("number is negative");
        }
        else
        {
        	System.out.println("number is neigther positive neither negative");
        }
	}

}
