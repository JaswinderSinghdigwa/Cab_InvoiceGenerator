package com.bridgelabz.canInvoiceGeneratorTest;

import com.bridgelabz.CabInvoiceGenerator.CabRide;
import org.junit.Assert;
import org.junit.Test;

public class CabRideTest {
    @Test
    public void fairCalculator_shouldReturn_minimumFair(){
        CabRide ride = new CabRide(0.2f,1,"rajat123");
        float fair = ride.fairCalculator();
        Assert.assertEquals(5f,fair,0);
    }
    @Test
    public void fairCalculator_shouldReturn_totalFair(){
        CabRide ride = new CabRide(1,1,"rajat123");
        float fair = ride.fairCalculator();
        Assert.assertEquals(11f,fair,0);
    }
}
