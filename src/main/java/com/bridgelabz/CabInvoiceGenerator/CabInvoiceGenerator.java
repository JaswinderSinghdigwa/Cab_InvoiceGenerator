package com.bridgelabz.CabInvoiceGenerator;
import java.util.ArrayList;
public class CabInvoiceGenerator
{
	public static void main(String args[])
	{	
		CabRideRecorder record = new CabRideRecorder();
		User user1 = new User("CX001");
		User user2 = new User("CX002");
		User user3 = new User("CX003");
		CabRide ride = new CabRide(2f,10f,user1.userID);
		CabRide ride2 = new CabRide(5f,2f,user1.userID);
		CabRide ride3 = new CabRide(5f,2f,user3.userID);
		record.add(ride);
		record.add(ride2);
		record.add(ride3);
		System.out.println("Aggregate Ride Fare: Rs"+record.sum(user1.userID));
		System.out.println("Number Of Rides: "+record.numberOfRides());
		System.out.println(String.format("Average Fare: Rs %1$,.2f",record.average()));
	}
}
