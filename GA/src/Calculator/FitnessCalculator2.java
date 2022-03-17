package Calculator;

import java.util.ArrayList;

import Models.Data;

public class FitnessCalculator2 {
	
public int calculator(ArrayList<Data> timetable) {
		
		HardConstraints sf1 = new DAYS_ATTR2();
		HardConstraints sf2 = new GAPS2();
		HardConstraints sf3 = new M4SHIFT_ATTR2();
		HardConstraints sf4 = new SHIFT_ATTR2();
		HardConstraints sf5 = new P_FREQ2();
		HardConstraints sf6 = new M10DAY_ATTR2();

		HardConstraints terminator = new NoConstraints2();
		
		sf1.setNext(sf2);
		sf2.setNext(sf3);
		sf3.setNext(sf4);
		sf4.setNext(sf5);
		sf5.setNext(sf6);
		sf6.setNext(terminator);
		return sf1.calculator(timetable);
		
	}
	
}
