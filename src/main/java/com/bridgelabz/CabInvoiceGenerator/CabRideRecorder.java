package com.bridgelabz.CabInvoiceGenerator;

import java.util.ArrayList;

public class CabRideRecorder
{
	public ArrayList<CabRide> list = new ArrayList<>();
	public double sum()
	{
		double sum=0;
		for(CabRide ride:list)
		{
			sum+=ride.fairCalculator();
		}
		return sum;
	}
	public double sum(String userID)
	{
		double sum=0;
		for(CabRide ride:list)
		{
			if(ride.userID.equals(userID))
			{
				sum+=ride.fairCalculator();
			}
		}
		return sum;	
	}
	public int numberOfRides()
	{
		return list.size();
	}
	public int numberOfRides(String userID)
	{
		int rideCount=0;
		for(CabRide ride: list)
		{
			if(ride.userID.equals(userID))
			{
				rideCount+=1;
			}
		}
		return rideCount;
	}
	public double average()
	{
		return sum()/numberOfRides();
	}
	public double average(String userID)
	{
		return sum(userID)/numberOfRides(userID);
	}
	
	public void add(CabRide ride)
	{
		list.add(ride);
	}
}
