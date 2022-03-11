package Calculator;

import java.util.ArrayList;

import Models.Data;

public class GAPS implements SoftConstraints {

	private SoftConstraints next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 3 + next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = next;		
	}

}
