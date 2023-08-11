package Java.executavel;

import cursojava.classes.Aluno;

public class FirstJavaClass {
	
	public static void main(String[] args) {
		
		/*objeto criado*/
		Aluno aluno = new Aluno();
		
		aluno.setNome("Dudu Roberto");
		aluno.setIdade(29);
		aluno.setNota1(60);
		aluno.setNota2(85);
		aluno.setNota3(78);
		
		System.out.println("Nome é: " + aluno.getNome());
		System.out.println("Idade é: " + aluno.getIdade());
		System.out.println("Media é: " + aluno.getMediaNota());
		System.out.println("Resultado do aluno: " + (aluno.getResultado() ? "Aprovado" : "Reprovado"));
	}
}