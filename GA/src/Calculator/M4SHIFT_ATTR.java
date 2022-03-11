package Calculator;

import java.util.ArrayList;

import Models.Data;

public class M4SHIFT_ATTR implements SoftConstraints {


 private M4SHIFT_ATTR next;

@Override
public int calculator(ArrayList<Data> timetable) {
	return 7 + next.calculator(timetable);
}

@Override
public void setNext(SoftConstraints next) {
	this.next = (M4SHIFT_ATTR) next;		
}






}
