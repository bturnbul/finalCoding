package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {


	@Test(expected=RateException.class)
	public void rateTest() throws RateException {
		
		assert(RateBLL.getRate(600)==5);
		
		boolean Raised = false;
		
		try{
			RateBLL.getRate(12);
		} catch (RateException R) {
			Raised = true;
		}
		assertTrue(Raised);
	}
}
