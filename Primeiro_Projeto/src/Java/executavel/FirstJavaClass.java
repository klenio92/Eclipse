package Java.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

/*TEST*/

public class FirstJavaClass {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String Nota1 = JOptionPane.showInputDialog("Qual a nota do primeiro Trimestre?");
		String Nota2 = JOptionPane.showInputDialog("Qual a nota do segundo Trimestre?");
		String Nota3 = JOptionPane.showInputDialog("Qual a nota do terceiro Trimestre?");
		
		Aluno aluno = new Aluno();
		
		
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setCpf(cpf);
		aluno.setNota1(Double.parseDouble(Nota1));
		aluno.setNota2(Double.parseDouble(Nota2));
		aluno.setNota3(Double.parseDouble(Nota3));
		
		System.out.println(aluno.toString());
		System.out.println("Media do aluno: " + aluno.getMediaNota());
		System.out.println("Resultado: " + aluno.getResultado());
	}
}