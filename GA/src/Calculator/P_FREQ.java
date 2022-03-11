package Calculator;

import java.util.ArrayList;

import Models.Data;

public class P_FREQ implements SoftConstraints {

	private SoftConstraints next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 8 + next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = next;
		
	}


}
