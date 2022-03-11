package Calculator;

import java.util.ArrayList;

import Models.Data;

public class FitnessCalculator {
	
	public int calculator(ArrayList<Data> timetable) {
		
		SoftConstraints sf1 = new DAYS_ATTR();
		SoftConstraints sf2 = new GAPS();
		SoftConstraints terminator = new NoConstraints();
		
		sf1.setNext(sf2);
		sf2.setNext(terminator);
		
		return sf1.calculator(timetable);
		
	}

}
