package clinicamedica;


public class ClinicaMedica {
	public String nome;
	public String morada;
	public String descricao;
	public String horarioFuncionamento;
	public String numeroTelefone;
	
	
	public ClinicaMedica (String nome, String morada,String descricao, String horarioFuncionamento, String numeroTelefone  )
	{
		  this.nome=nome;
		  this.morada=morada;
		  this.descricao=descricao;
		  this.numeroTelefone=numeroTelefone;
		  this.horarioFuncionamento=horarioFuncionamento;
	}

	public ClinicaMedica() {
	}

	public String getNome() {
		return nome;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public String toString() {
		return "Clinica Médica [nome=" + nome + ", morada=" + morada + ",descrição= "+ descricao + " numeroTefelone=" + numeroTelefone
				+ ", horarioFuncionamento=" + horarioFuncionamento + "]";
	}
	
}
	
	
	
	
