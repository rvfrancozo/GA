package Calculator;

import java.util.ArrayList;

import Models.Data;

public class M4SHIFT_ATTR2 implements HardConstraints {

	private HardConstraints next;
	
	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 2 +  next.calculator(timetable);
	}

	@Override
	public void setNext(HardConstraints next) {
		this.next = next;
	}

}
