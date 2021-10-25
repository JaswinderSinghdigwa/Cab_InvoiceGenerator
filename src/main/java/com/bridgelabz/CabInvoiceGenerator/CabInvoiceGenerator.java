package com.bridgelabz.CabInvoiceGenerator;
import java.util.ArrayList;
public class CabInvoiceGenerator
{

	static ArrayList<CabRide> list = new ArrayList<CabRide>();
	public static double sum()
	{
		double sum=0;
		for(CabRide i:list)
		{
			sum+=i.fairCalculator();
		}
		return sum;
	}
	public static void main(String args[])
	{	
		CabRide ride = new CabRide(2f,10f);
		CabRide ride2 = new CabRide(5f,2f);
		list.add(ride);
		list.add(ride2);
		System.out.println("Rs"+sum());
	}
}
