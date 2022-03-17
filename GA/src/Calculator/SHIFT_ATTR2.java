package Calculator;

import java.util.ArrayList;

import Models.Data;

public class SHIFT_ATTR2 implements HardConstraints {

	private HardConstraints next;
	
	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 9 + next.calculator(timetable);
	}

	@Override
	public void setNext(HardConstraints next) {
		this.next = next;
	}

}
