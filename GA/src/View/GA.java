package View;
import java.util.ArrayList;
import java.util.List;

import Controls.InstanceLoader;
import Models.Data;

public class GA {
	
	public static void main(String[] args) {
		
		List<Data> valores = new InstanceLoader().loader("horario.csv");
		
		System.out.println(valores.size()); 

	}

}
