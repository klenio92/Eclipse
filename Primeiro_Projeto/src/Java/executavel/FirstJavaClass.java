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
		
		/*dataNascimento, nomePai, nomeMae nao usados para facilitar debug/compile */

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
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina?");
			if(escolha == 0) {
				String removerDisciplina = JOptionPane.showInputDialog("Qual a Disciplina?");
				aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() -1);
			} else {
				System.out.println("Disciplina nao removida");
			}
		

		System.out.println(aluno.toString());
		System.out.println("Media do aluno: " + aluno.getMediaNota());
		System.out.println("Resultado: " + aluno.getResultado());
	}
}