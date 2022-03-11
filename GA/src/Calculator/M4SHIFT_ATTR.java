package Calculator;

import java.util.ArrayList;

import Models.Data;

public class M4SHIFT_ATTR implements SoftConstraints {

	private SoftConstraints next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		// TODO Auto-generated method stub
		return 2 +  next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = next;
		
	}

	






}
