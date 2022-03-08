package View;
import java.util.ArrayList;
import java.util.List;

import Calculator.FitnessCalculator;
import Controls.InstanceLoader;
import Models.Data;

public class GA {
	
	public static void main(String[] args) {
		
		ArrayList<Data> valores = new InstanceLoader().loader("horario.csv");
		
		System.out.println(valores.size()); //teste novo
		
		System.out.println(new FitnessCalculator().calculator(valores));

	}

}
