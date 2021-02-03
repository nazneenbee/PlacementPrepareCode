package largest;

import java.util.Scanner;

public class LargestAmongMultipleNumber {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner sc=new Scanner(System.in);
	 * System.out.println("enter the size of array"); 
	 * int n=sc.nextInt(); 
	 * int arr[]=new int[n]; 
	 * int biggest=arr[0];
	 * System.out.println("enter "+n+" integer array element"); 
	 * for(int i=0;i<arr.length; i++) 
	 * { arr[i]=sc.nextInt(); 
	 * if(biggest<arr[i]) {
	 * biggest=arr[i]; } }
	 * 
	 * System.out.println("biggest element are "+biggest);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first element");
		int a=sc.nextInt();
		System.out.println("enter second element");
		int b=sc.nextInt();
		System.out.println("enter third element");
		int c=sc.nextInt();
		
	
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
