package Java.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class FirstJavaClass {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String disciplina1 = JOptionPane.showInputDialog("Qual é a primeira Disciplina?");
		String Nota1 = JOptionPane.showInputDialog("Qual a nota do primeiro Trimestre?");
		String disciplina2 = JOptionPane.showInputDialog("Qual é a segunda Disciplina?");
		String Nota2 = JOptionPane.showInputDialog("Qual a nota do segundo Trimestre?");
		String disciplina3 = JOptionPane.showInputDialog("Qual é a terceira Disciplina?");
		String Nota3 = JOptionPane.showInputDialog("Qual a nota do terceiro Trimestre?");
		
		Aluno aluno = new Aluno();
		
		
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setCpf(cpf);
		
		aluno.getDisciplina().setNota1(Double.parseDouble(Nota1));
		aluno.getDisciplina().setNota2(Double.parseDouble(Nota2));
		aluno.getDisciplina().setNota3(Double.parseDouble(Nota3));
		
		aluno.getDisciplina().setDisciplina1(disciplina1);
		aluno.getDisciplina().setDisciplina2(disciplina2);
		aluno.getDisciplina().setDisciplina3(disciplina3);
		
		System.out.println(aluno.toString());
		System.out.println("Media do aluno: " + aluno.getMediaNota());
		System.out.println("Resultado: " + aluno.getResultado());
	}
}