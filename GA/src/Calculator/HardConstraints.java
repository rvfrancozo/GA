package Calculator;

import java.util.ArrayList;

import Models.Data;

public interface HardConstraints {

	int calculator(ArrayList<Data> timetable); 
	void setNext(HardConstraints next);
	
}
