package Calculator;

import java.util.ArrayList;

import Models.Data;

public class DAYS_ATTR2 implements HardConstraints {

	private HardConstraints next;
	
	@Override
	public int calculator(ArrayList<Data> timetable) {
		// TODO Auto-generated method stub
		return 2 + next.calculator(timetable);
	}

	@Override
	public void setNext(HardConstraints next) {
		this.next = next;		
	}

}
