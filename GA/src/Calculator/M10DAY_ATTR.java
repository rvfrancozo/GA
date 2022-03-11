package Calculator;

import java.util.ArrayList;

import Models.Data;

public class M10DAY_ATTR implements SoftConstraints{
	
	private M10DAY_ATTR next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 3 + next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = (M10DAY_ATTR) next;		
	}

}
