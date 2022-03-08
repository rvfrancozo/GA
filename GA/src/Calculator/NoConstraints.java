package Calculator;

import java.util.ArrayList;

import Models.Data;

public class NoConstraints implements SoftConstraints {

	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 0;
	}

	@Override
	public void setNext(SoftConstraints next) {		
	}

}
