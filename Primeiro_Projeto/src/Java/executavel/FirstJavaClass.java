package Java.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class FirstJavaClass {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		String qtdAlunos = JOptionPane.showInputDialog("Quantos alunos a lista tera?");
		for (int qtd = 1; qtd <= (Integer.valueOf(qtdAlunos)); qtd++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
			String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
			String numDisciplina = JOptionPane.showInputDialog("Quantas Disciplinas o aluno tem na grade?");

			Aluno aluno = new Aluno();

			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));
			aluno.setCpf(cpf);
			aluno.setNumDisciplina(Integer.valueOf(numDisciplina));

			for (int pos = 1; pos <= aluno.getNumDisciplina(); pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Qual foi a Nota nessa Disciplina?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina?");
			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual a Disciplina?");
					aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar remover Disciplinas?");
				}
			}
			alunos.add(aluno);
		}

		for (Aluno aluno : alunos) {

			if (aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		System.out.println("==============================Lista dos Reprovados================-");
		for (Aluno aluno : alunosReprovados) {
			System.out.println(" ");
			System.out.println("Resultado: Aluno " + aluno.getNome() + " " + aluno.getResultado() + " com media: "
					+ aluno.getMediaNota());

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina);
			}
			System.out.println(" ");

		}
		System.out.println("==============================Lista dos Recuperacao================-");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println(" ");
			System.out.println("Resultado: Aluno " + aluno.getNome() + " " + aluno.getResultado() + " com media: "
					+ aluno.getMediaNota());

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina);
			}
			System.out.println(" ");
		}
		System.out.println("==============================Lista dos Aprovados================-");
		for (Aluno aluno : alunosAprovados) {
			System.out.println(" ");
			System.out.println("Resultado: Aluno " + aluno.getNome() + " " + aluno.getResultado() + " com media: "
					+ aluno.getMediaNota());

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina);
			}
			System.out.println(" ");
		}
	}
}