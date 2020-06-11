package clinicamedica;

import java.util.ArrayList;


public class Administrador {
	private String nome;
	private  int numeroFuncionario;
	private String numeroCC;
	protected String username;
	private String password;
	public ClinicaMedica clinicaMedica;
	public Candidato candidato;
	public ArrayList<Candidato> CandidatoValido;
	public ArrayList<Candidato> CandidatoInvalido;
	public Especialidade especialidade;
	public ArrayList<Candidatura> Candidatura;
	public ArrayList<Candidatura> CandidaturaValidada;
	public ArrayList<Candidatura> CandidaturaNaoValidada;
	
	
	public int getNumeroFuncionario() {
		return this.numeroFuncionario;
	}	
	public String getnumeroCC() {
		return this.numeroCC;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	 
	public ClinicaMedica getclinicamedica() {
		return this.clinicaMedica;
	}
			
	public Administrador(int numeroFuncionario, String nome, String username, String password,String numeroCC, ClinicaMedica clinicamedica) {
		this.numeroFuncionario = numeroFuncionario;
		this.nome = nome;
		this.username=username;
		this.password = password;
		this.numeroCC = numeroCC;
		this.clinicaMedica=clinicamedica;
		
	}
	
	public void ValidarCandidatura(Candidato candidato)
	{
		//try catch 
		if(candidato.nome == " " || candidato.numeroCC ==" " || candidato.especialidade.equals(null)|| candidato.numeroCedulaProfissional== ""|| candidato.numeroCedulaProfissional=="" || candidato.email=="" || candidato.morada =="" || candidato.contactoTelefonico==""|| candidato.curriculumVitae=="")
		{
			CandidatoInvalido.add(candidato);
			Candidatura.remove(candidato);
		}
		else {
			CandidatoValido.add(candidato);
			Candidatura.remove(candidato);
		}
	} 
	
	
	public boolean ConsultarCandidatoValido(Candidatura c) {
		for(Candidato e: CandidatoValido)
			if(c.candidato.nome== e.nome)
				return true;
		return false;
	}
	
	public boolean ConsultarCandidatoInvalido(Candidatura c) {
				for(Candidato e:CandidatoInvalido) 
					if(c.candidato.nome == e.nome)
						return true;
		return false;
						
	}
	public void Mostrar(Candidatura candidatura)
	{

		 System.out.println(" Nome : " + candidato.getNome());
		 System.out.println(" Número de CC : " + candidato.getnumeroCC());
		 System.out.println(" Número da Cédula Profissional: " + candidato.getnumeroCedulaProfissional());
		 System.out.println(" Validade Cedula Profissional : " + candidato.getvalidadeCedulaProfissional());
		 System.out.println(" Email : " + candidato.getemail());
		 System.out.println(" Morada: " + candidato.getmorada());
		 System.out.println(" Contacto Telefónico : " + candidato.getcontactoTelefonico());
		 System.out.println("Curriculum Vitae : " + candidato.getcurriculumVitae());
		 System.out.println("Especialidade: " + candidato.getespecialidade());
	}
	
	
	
	public void ConsultarEspecialidade(Especialidade e)
	{
		for(Candidatura m: Candidatura) {
			if(m.especialidade == e)
				Mostrar(m);
		}
	}
	
	public void PesquisaEspecialidadeValido(Especialidade a)
	{
		int contador=0;
		for( Candidato g: CandidatoValido)
			if(g.especialidade == a) {
				g.toString();
				contador++;
			}
				System.out.println("Número de candidatos validados com a especialidade " + a + "sao " + contador);
	}
	
	public void PesquisaEspecialidadeInvalido(Especialidade a)
	{
		int contador=0;
		for( Candidato g: CandidatoInvalido)
			if(g.especialidade == a) {
				g.toString();
				contador++;
			}
				System.out.println("Número de candidatos não validados com a especialidade " + a + "sao " + contador);
	}


	public void CandidaturasNovasNaoValidadas(Especialidade s)
	{
		int incremento=0;
		for(Candidatura f: CandidaturaValidada)
			if(f.especialidade!= s ) {
				f.toString();
				incremento++;
			}
		System.out.println("Número de candidaturas validadas com a especialidade " + s + "sao " +incremento);
	
	
			
			
			
			
	}








}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

