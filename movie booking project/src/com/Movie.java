package com;

public class Movie 
{

	
	private String movieName;
	private int tickets;
	private int cost;
	
	public Movie(String name,int tickets,int cost)
	{
		this.movieName=name;
		this.tickets=tickets;
		this.cost=cost;
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", tickets=" + tickets + ", cost=" + cost + "]";
	}
	
	
	
}
