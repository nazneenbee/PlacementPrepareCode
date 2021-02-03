package checkalpha;

import java.util.Scanner;

public class CheckAlphabetVovelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabets");
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
			System.out.println("alphabets are vowel");
		}
		else
		{
			System.out.println("alphabets are consonent");
		}
   
	}

}
