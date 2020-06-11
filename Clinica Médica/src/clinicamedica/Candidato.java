package clinicamedica;

public class Candidato {
	public  String nome;
	public  String numeroCC;
	public String numeroCedulaProfissional;
	protected  String validadeCedulaProfissional;
	public  String email;
	public  String morada;
	protected  String contactoTelefonico;
	public String curriculumVitae;
	public Especialidade especialidade;
	public Candidatura candidatura;
	
	public Candidato (String nome,Especialidade especialidade,String numeroCC,String numeroCedulaProfissional,String validadeCedulaProfissional,String email,String morada,String contactoTelefonico,String curriculumVitae)
	{
		this.nome=nome;
		this.numeroCC=numeroCC;
		this.numeroCedulaProfissional=numeroCedulaProfissional;
		this.validadeCedulaProfissional=validadeCedulaProfissional;
		this.email= email;
		this.morada=morada;
		this.contactoTelefonico=contactoTelefonico;
		this.curriculumVitae=curriculumVitae;
		this.especialidade=especialidade;
	}
	
	public Candidato(String nome2, String string, String numeroCC2, String numeroCedulaProfissional2,
			String validadeCedulaProfissional2, String email2, String morada2, String contactoTelefonico2,
			String curriculumVitae2) {

	}

	public String getNome() {
		return nome;
	}
	
	public Especialidade getespecialidade()
	{
		return especialidade;
	}
	
	public String getnumeroCC ()
	{
		return numeroCC;
	}
	
	public String getnumeroCedulaProfissional  ()
	{
		return numeroCedulaProfissional;
	}
	
	public String getvalidadeCedulaProfissional()
	{
		return validadeCedulaProfissional;
	}
	
	public String getemail ()
	{
		return email;
	}
	
	public String getmorada ()
	{
		return morada;
	}
	
	public String getcontactoTelefonico()
	{
		return contactoTelefonico;
	}
	
	public String getcurriculumVitae()
	{
		return curriculumVitae;
	}
	
	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", especialidade=" +especialidade+ ", numeroCC=" + numeroCC
				+ ", numeroCedulaProfissional=" + numeroCedulaProfissional + ", validadeCedulaProfissional="
				+ validadeCedulaProfissional + ", email=" + email + ", morada=" + morada + ", contactoTelefonico="
				+ contactoTelefonico + ", curriculumVitae=" + curriculumVitae + "]";
	}

	
	

	
	
}
