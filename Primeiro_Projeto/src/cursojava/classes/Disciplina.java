package cursojava.classes;

import java.util.Objects;

public class Disciplina {

	private double nota1;
	private double nota2;
	private double nota3;
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	
	

	@Override
	/*ALTERADA A ORDEM PELO ToString*/
	public String toString() {
		return "[nota1=" + nota1 + ", disciplina1=" + disciplina1 + ", nota2=" + nota2 + ", disciplina2="
	+ disciplina2 +  ", nota3=" + nota3 + ", disciplina3=" + disciplina3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina1, disciplina2, disciplina3, nota1, nota2, nota3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina1, other.disciplina1) && Objects.equals(disciplina2, other.disciplina2)
				&& Objects.equals(disciplina3, other.disciplina3)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3);
	}
	
}
