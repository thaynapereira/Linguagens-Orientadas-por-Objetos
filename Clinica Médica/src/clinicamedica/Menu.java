package clinicamedica;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public  ArrayList<Administrador> adimnistrador;
	public  ArrayList<Especialidade> especialidade;
	public ArrayList<Candidatura> candidatura;
	public static ClinicaMedica clinicamedica;
	public Candidato candidato;
	static Administrador v;
	
	public Menu(ClinicaMedica c) {
		this.clinicamedica=c;
	}
	
	public void login(ArrayList<Administrador> administrador) {
		int numero;
		while(true) {		
		System.out.println("Introduza o seu username: ");
		System.out.println("Introduza a sua password:");
		Scanner s = new  Scanner(System.in);
		numero = s.nextInt();
		
		for(Administrador elemento: administrador) 
	           if(numero==elemento.getNumeroFuncionario())
				  menuIniciar();
		}
	}
	public static void menuIniciar() {
		while(true) {	
		System.out.println(" -------------------- "
				+ "-----------Menu Vendedor:-----------" 
				+"------Selecione a sua especialidade------"
				+"\n        1- Informa��es da Clinica M�dica"
				+ " \n      2 - Validar as candidaturas submetidas, as que tiverem os requesitos obrigat�rios"
				+ "\n       3 - Consultar a informa��o de uma dada candidatura submetida n�o validada"
				+ "\n       4 - Consultar a informa��o de um dado candidato validado"
				+ "\n       5 - Consultar por especialidade m�dica as candidaturas submetidas"	
				+ "\n       6 - Saber por especialidade m�dica quantas  candidaturas,  isto �, que ainda n�o\r\n foram validadas"
				+ "\n       7 - Saber por especialidade m�dica quais as  candidaturas,  isto �, que ainda n�o\\r\\n foram validadas"
				+ "\n       8 - Saber por especialidade m�dica quantas candidaturas validadas"
				+ "\n       9 - Saber por especialidade m�dica quais as candidaturas validadas"
				+ "\n       10 - sair"
				+ "\n------------------------------------------------------"
				+ "\n------------------------------------------------------");
	
	
			System.out.println("Que opcao pretende escolher");
			Scanner s = new  Scanner(System.in);
			int numero =s.nextInt();
			switch(numero){
					case 1: 
						informacoesClinicaMedica();
					     break;
					case 2:
						//validarCandidaturasSubmetidas();
					case 3:
					    //consultarCandidaturaNaoValida();
					case 4:
						//consultarCandidatoValido();
					case 5:
						//consultarEspecialidadeCandidaturasSubmetidas();
					case 6:
						//especialidadeQuantasCandidaturasNaoValid();
					case 7:
						//especialidadeQuaisCandidaturaNaoValid();
					case 8:
						//especialidadeQuantasCandidaturasValid();
					case 9:
						//especialidadeQuaisCandidaturaValid();
					case 10:
						System.out.println("O programa terminou");
						System.exit(10);
		            default:
		              System.out.printf("Op��o inv�lida \n"); 
		              break;
		      }
			System.out.println("Carregue num bot�o para voltar ao menu ");
			s.next();
			}	
}
	public static  void informacoesClinicaMedica() {
		 System.out.println(" Nome : " + clinicamedica.getNome());
		 System.out.println(" Morada: " + clinicamedica.getMorada());
		 System.out.println(" Descri��o : " + clinicamedica.getDescricao());
		 System.out.println(" Hor�rio de Funcionamento: " + clinicamedica.getHorarioFuncionamento());
		 System.out.println(" N�mero de Telefone : " + clinicamedica.getNumeroTelefone());
		 
	}
	
	public void validarCandidaturasSubmetidas (Administrador s) {
		System.out.println("Valida��o das Candidaturas: " + s.ValidarCandidatura(candidato));
			
	}
	
	public static int mostrarEspecialidade(ArrayList<Especialidade> especialidade) {
	    int opcao=1;
		for(Especialidade esp: especialidade)
			System.out.println("\n" + opcao++ + "\n" + esp.nome );	
		return opcao;
	}
	
	
	//public void informacaoValidaCandidato(Administrador s) {
		//System.out.println("Candidato V�lido ap�s Valida��o das candidaturas submetidas: " + s.ValidarCandidatura());
		//System.out.println("Informa��o do candidato" + s.ConsultarCandidatoValido());
		//System.out.print("Informa��o");
		
		
		
	//}
	
	
	
	
	
	
	
		

}
