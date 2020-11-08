package com.bridgelabz.CabInvoiceGenerator;

public class CabInvoiceGenerator {
	public static void main(String args[])
	{
		CabRide ride = new CabRide(0.2f,1.0f);
		ride.FARE_PER_KILOMETER=10;
		ride.FARE_PER_MINUTE=1;
		System.out.println("Rs"+ride.fairCalculator());
	}
}
