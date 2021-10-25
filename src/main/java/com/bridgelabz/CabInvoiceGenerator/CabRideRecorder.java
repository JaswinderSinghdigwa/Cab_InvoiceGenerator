package com.bridgelabz.CabInvoiceGenerator;

import java.util.ArrayList;

public class CabRideRecorder
{
	private ArrayList<CabRide> list = new ArrayList<CabRide>();
	public double sum()
	{
		double sum=0;
		for(CabRide i:list)
		{
			sum+=i.fairCalculator();
		}
		return sum;
	}
	public int numberOfRides()
	{
		return list.size();
	}
	public double average()
	{
		return sum()/numberOfRides();
	}
	public void add(CabRide ride)
	{
		list.add(ride);
	}
}