package Java.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class FirstJavaClass {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String numDisciplina = JOptionPane.showInputDialog("Quantas Disciplinas o aluno tem na grade?");

		Aluno aluno = new Aluno();

		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setCpf(cpf);
		aluno.setNumDisciplina(Integer.valueOf(numDisciplina));

		for (int pos = 1; pos <= aluno.getNumDisciplina(); pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da Disciplina?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual foi a Nota nessa Disciplina?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno.getDisciplinas().add(disciplina);

		}

		System.out.println(aluno.toString());
		System.out.println("Media do aluno: " + aluno.getMediaNota());
		System.out.println("Resultado: " + aluno.getResultado());
	}
}