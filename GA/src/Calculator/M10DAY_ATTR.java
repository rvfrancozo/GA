package Calculator;

import java.util.ArrayList;

import Models.Data;

public class M10DAY_ATTR implements SoftConstraints{

	private SoftConstraints next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		// TODO Auto-generated method stub
		return 3 + next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = next;
		
	}


	

}
