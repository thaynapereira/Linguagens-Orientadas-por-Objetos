package clinicamedica;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {						
			ArrayList<Administrador> administrador= new ArrayList<Administrador>();
			
			ArrayList<Especialidade> especialidade = new ArrayList<Especialidade>();
			ArrayList<Candidato> candidato= new ArrayList<Candidato>();
			ArrayList<Candidatura> candidatura = new ArrayList<Candidatura>();
			
			
			
			
			ClinicaMedica clinicamedica1 = new ClinicaMedica ("Clinica e companhia", "Coimbra ","Clinica para todo o tipo de idades", "10:00 - 2:00","239789514" );
			
	        
	        Candidato candidato1 = new Candidato("Maria","Pediatria"," 165478256 ZX7","23423t", "23 Dezembro 2018", "maria.234@hotmail.com", "Coimbra", "963254125", "Com experiencia");
		    candidatura.addAll(candidatura);
		    
			ClinicaMedica clinicamedica = null;
			Menu m = new  Menu(clinicamedica);
		    m.login(administrador);

	}

}
