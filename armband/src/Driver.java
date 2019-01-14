

import ap.lib.IArmbandMachine;
import armband.ArmbandMachine;

public class Driver {
	public static void main(String[] args) {
		IArmbandMachine machine =
				new ArmbandMachine();
		System.out.println("Cost: "+
		machine.getCost(3,5));
	}

}
