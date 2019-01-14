package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ap.lib.IArmbandMachine;
import armband.ArmbandMachine;


public class armbandmachinetest {

	@Test
	public void ShouldCalculateCost() {
		IArmbandMachine machine =
				new ArmbandMachine();
		assertEquals(15, machine.getCost(3,5));
		
		
	}

}
