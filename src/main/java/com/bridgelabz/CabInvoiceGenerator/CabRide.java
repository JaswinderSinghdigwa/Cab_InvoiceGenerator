package com.bridgelabz.CabInvoiceGenerator;

public class CabRide 
{
	int FARE_PER_KILOMETER;
	int FARE_PER_MINUTE;
	float totalFare;
	float distance;
	float time;
	CabRide(float distance,float time)
	{
		this.distance=distance;
		this.time=time;	
	}
	public float fairCalculator()
	{
		totalFare = FARE_PER_KILOMETER*distance + FARE_PER_MINUTE*time;
		return (float)Math.max(5f, totalFare);
	}
}
