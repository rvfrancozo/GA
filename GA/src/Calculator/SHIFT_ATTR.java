package Calculator;

import java.util.ArrayList;

import Models.Data;

public class SHIFT_ATTR implements SoftConstraints{

	private SoftConstraints next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 9 + next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = next;
		
	}
	
	

	

}
