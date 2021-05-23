package com.bridgelabz.canInvoiceGeneratorTest;

import com.bridgelabz.CabInvoiceGenerator.CabRide;
import com.bridgelabz.CabInvoiceGenerator.CabRideRecorder;
import com.bridgelabz.CabInvoiceGenerator.User;
import org.junit.Assert;
import org.junit.Test;

public class CabRideRecorderTest {
    User user1 = new User("rajat@01");
    User user2 = new User("rajat@02");
    CabRide ride1 = new CabRide(10,30,user1.userID);
    CabRide ride2 = new CabRide(10,30,user2.userID);
    CabRide ride3 = new CabRide(15,60, user1.userID);
    CabRide ride4 = new CabRide(15,90, user2.userID);

    CabRideRecorder recorder = new CabRideRecorder();
    @Test
    public void sum_shouldReturn_totalFairOfAllRidesSoFar(){
        recorder.add(ride1);
        recorder.add(ride2);
        recorder.add(ride3);
        recorder.add(ride4);
        Assert.assertEquals(710,recorder.sum(),0);
    }
    @Test
    public void sum_shouldReturn_totalFairOfAllRidesSoFar_forParticularUser(){
        recorder.add(ride1);
        recorder.add(ride2);
        recorder.add(ride3);
        recorder.add(ride4);
        Assert.assertEquals(340,recorder.sum(user1.userID),0);
    }
    @Test
    public void numOfRides_shouldReturn_Zero_ifNoRidesAreServed(){
        Assert.assertEquals(0,recorder.numberOfRides(user2.userID),0);
    }
    @Test
    public void numOfRides_shouldReturn_totalNumberOfRidesServed(){
        recorder.add(ride1);
        recorder.add(ride2);
        recorder.add(ride3);
        recorder.add(ride4);
        Assert.assertEquals(4,recorder.numberOfRides(),0);
    }
    @Test
    public void numOfRides_shouldReturn_totalNumberOfRidesServed_forParticularUser(){
        recorder.add(ride1);
        recorder.add(ride2);
        recorder.add(ride3);
        recorder.add(ride4);
        Assert.assertEquals(2,recorder.numberOfRides(user2.userID),0);
    }
    @Test
    public void average_shouldReturn_averageFairPerRide_forRidesServedSoFar(){
        recorder.add(ride1);
        recorder.add(ride2);
        recorder.add(ride3);
        recorder.add(ride4);
        Assert.assertEquals(177.5,recorder.average(),0);
    }
    @Test
    public void average_shouldReturn_averageFairPerRide_forParticularUser(){
        recorder.add(ride1);
        recorder.add(ride2);
        recorder.add(ride3);
        recorder.add(ride4);
        Assert.assertEquals(170,recorder.average(user1.userID),0);
    }



}
