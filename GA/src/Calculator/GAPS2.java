package Calculator;

import java.util.ArrayList;

import Models.Data;

public class GAPS2 implements HardConstraints{

	private HardConstraints next;
	
	@Override
	public int calculator(ArrayList<Data> timetable) {
		// TODO Auto-generated method stub
		return 3 + next.calculator(timetable);
	}

	@Override
	public void setNext(HardConstraints next) {
		// TODO Auto-generated method stub
		this.next = next;	
	}
	
}
