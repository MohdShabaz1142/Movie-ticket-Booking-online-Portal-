package com;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);

		BookMyShow bms=new BookMyShowImpl();
		bms.addmovie();

		int choice=1;

		while(choice==1)
		{
			bms.displaymovie();
			bms.bookmovie();
			System.out.println("press 1 to continue or any other to key to checkout");
			choice=sc.nextInt();
			System.out.println("-----------------------------------------------------");

		}
		bms.checkout();
	}
}
