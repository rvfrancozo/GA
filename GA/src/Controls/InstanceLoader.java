//Leonardo

//Atualização

package Controls;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Data;

public class InstanceLoader {
	//atualizado
	
	private static Scanner input;
	private static ArrayList<Data> valores = new ArrayList<Data>();
	
	public ArrayList<Data> loader(String file) {
		
		try {
			input = new Scanner(Paths.get(file));
			input.nextLine();
			
			while(input.hasNext()) {
				String[] data = input.nextLine().split(",");
				Data dados = new Data();
				
				dados.setCurso(data[1]);
				dados.setTurma(data[2]);
				dados.setSemestre(Integer.parseInt(data[4]));
				dados.setDisciplina(data[5]);
				dados.setCH(Integer.parseInt(data[7]));
				dados.setDocente(data[8]);
				
				valores.add(dados);
				
			}
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		
		return valores;
		
	}

}
