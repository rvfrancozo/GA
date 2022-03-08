package Calculator;

import java.util.ArrayList;

import Models.Data;

public interface SoftConstraints {
	
	int calculator(ArrayList<Data> timetable); 
	void setNext(SoftConstraints next);

}
