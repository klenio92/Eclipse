package Java.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		String posicoes = JOptionPane.showInputDialog("Quantas notas tem essa materia?");

		double[] notas = new double[Integer.parseInt(posicoes)];
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + "?");
			notas[pos] = Double.valueOf(valor);

		}
		double notaMax = 0.0;

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + pos + "é: " + notas[pos]);

			if (pos == 0) {
				notaMax = notas[pos];
			} else {
				if (notas[pos] > notaMax)
					notaMax = notas[pos];
			}
		}
		System.out.println("Maior nota foi: " + notaMax);
	}
}