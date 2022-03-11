package Calculator;

import java.util.ArrayList;

import Models.Data;

public class FitnessCalculator {
	
	public int calculator(ArrayList<Data> timetable) {
		
		SoftConstraints sf1 = new DAYS_ATTR();
		SoftConstraints sf2 = new GAPS();
		SoftConstraints sf3 = new M4SHIFT_ATTR();
		SoftConstraints sf4 = new SHIFT_ATTR();
		SoftConstraints sf5 = new P_FREQ();
		SoftConstraints sf6 = new M10DAY_ATTR();

		SoftConstraints terminator = new NoConstraints();
		
		sf1.setNext(sf2);
		sf2.setNext(sf3);
		sf3.setNext(sf4);
		sf4.setNext(sf5);
		sf5.setNext(sf6);
		sf6.setNext(terminator);
		return sf1.calculator(timetable);
		
	}

}




