package fibbonum;

import java.util.Scanner;

public class FibbonacciGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("fibbonacci series are : ");
        
		int c=0;
		for(int i=1; i<=num; i++)
		{
			if(i==1)
			{
				System.out.println(a);
			}
			else if(i==2)
			{
				System.out.println(b);
			}
			else
			{
				c=a+b;
				if(c<num)
				{
					System.out.println(c);
					a=b;
					b=c;
				}
			}
			
			
		}
	}

}
