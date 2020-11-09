package com.bridgelabz.CabInvoiceGenerator;

import java.util.ArrayList;

public class CabInvoiceGenerator
{
	public static void main(String args[])
	{	
		CabRideRecorder record = new CabRideRecorder();
		CabRide ride = new CabRide(2f,10f);
		CabRide ride2 = new CabRide(5f,2f);
		CabRide ride3 = new CabRide(5f,2f);
		record.add(ride);
		record.add(ride2);
		record.add(ride3);
		System.out.println("Aggregate Ride Fare: Rs"+record.sum());
		System.out.println("Number Of Rides: "+record.numberOfRides());
		System.out.println(String.format("Average Fare: Rs %1$,.2f",record.average()));
	}
}
