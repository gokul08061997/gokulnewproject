package org.fact;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.println(" enter the number ");
		int n= c.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(" the factorial is "+f);
	}
}
