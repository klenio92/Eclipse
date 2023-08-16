package cursojava.classes;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	
	private Disciplina disciplina = new Disciplina();
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3()) / 3;
	}
		public String getResultado() {
			double media = this.getMediaNota();
			if(media>=70) {
				return "Aluno Aprovado";
		} else {
			return "Aluno Reprovado";
		}		
}

	@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
					+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", disciplina=" + disciplina + "]";
		}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
}
