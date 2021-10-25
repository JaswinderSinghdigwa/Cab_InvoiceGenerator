package com.bridgelabz.CabInvoiceGenerator;

public class CabRide 
{
	private final int FARE_PER_KILOMETER=10;
	private final int FARE_PER_MINUTE=1;
	float totalFare;
	float distance;
	float time;
	String userID;
	public CabRide(float distance, float time, String userID)
	{
		this.distance=distance;
		this.time=time;	
		this.userID=userID;
	}
	public float fairCalculator()
	{
		totalFare = FARE_PER_KILOMETER*distance + FARE_PER_MINUTE*time;
		return Math.max(5f, totalFare);
	}	
}
