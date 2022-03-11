package Calculator;

import java.util.ArrayList;

import Models.Data;

public class DAYS_ATTR implements SoftConstraints {
	
	//Criem outras classes como essas chamadas   
	//DAYS_ATTR		Dias com aulas alocadas
	//SHIFT_ATTR	Períodos com aulas alocadas 
	//M4SHIFT_ATTR	Períodos com mais de 4 aulas para um mesmo professor
	//GAPS			Lacunas entre aulas
	//M10DAY_ATTR	Dias com mais de 10 aulas para um mesmo professor
	//P_FREQ		Períodos que um prof leciona duas disciplinas para a mesma turma

	private SoftConstraints next;

	@Override
	public int calculator(ArrayList<Data> timetable) {
		return 2 + next.calculator(timetable);
	}

	@Override
	public void setNext(SoftConstraints next) {
		this.next = next;		
	}

}
