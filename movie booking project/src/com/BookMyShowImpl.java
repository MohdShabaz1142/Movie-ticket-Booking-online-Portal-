package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookMyShowImpl  implements BookMyShow
{
	Scanner sc=new Scanner(System.in);
	Map<Integer,Movie> m=new LinkedHashMap();

	int totalcost=0;

	@Override
	public void addmovie()
	{
		m.put(1, new Movie("avatar",30,100));
		m.put(2, new Movie ("naruto",20,150));
		m.put(3, new Movie("itachi",40,200));

	}

	@Override
	public void displaymovie()
	{
		Set<Integer> keys = m.keySet();
		
		
		for(Integer key:keys)
		{
			Movie mov=m.get(key);//get(key)return Movie object based on the key
			System.out.println("enter " +key +  "to book tickets for--> "  +mov.getMovieName());
			System.out.println("available tickets are:"+mov.getTickets());
			System.out.println("cost: Rs: "+mov.getCost());
			System.out.println("------------------------------------");
		}
		

	}

	@Override
	public void bookmovie() 
	{
		System.out.println("enter the choice(key):");
		int choice=sc.nextInt();
		
		Movie movie = m.get(choice);
		
		if(movie!=null)
		{
			System.out.println("selected movie is "+movie.getMovieName());
			System.out.println("enter the number of tickets:");
			int tickets=sc.nextInt();
			
			
			if(tickets<=movie.getTickets())
			{
				System.out.println("tickets available");
				
				//calculating current ticket cost
				int currentcost=tickets*movie.getCost();
				
				//update new tickets available
				movie.setTickets(movie.getTickets()-tickets);
				
				//adding currentcost to total cost
				totalcost =totalcost+currentcost;
				
				System.out.println("booking succesfull");
				System.out.println("********************");
				System.out.println("movie name:"+movie.getMovieName());
				System.out.println("number of tickets booked:"+tickets);
				System.out.println("current movie ticketcost:"+currentcost);
				System.out.println("****************************************");
			}
			else 
			{
				System.out.println("tickets not available");
			}
		}
		else
		{
			System.out.println("invalid choice");
		}


	}

	@Override
	public void checkout() 
	{
System.out.println("totalcost of tickets:"+totalcost);
System.out.println("happy hours");

	}

}
