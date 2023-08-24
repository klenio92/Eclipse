package Java.executavel;

public class Matriz {

	public static void main(String[] args) {
		int notas[][] = new int[2][3];

		notas[0][0] = 19;
		notas[0][1] = 27;
		notas[0][2] = 33;

		notas[1][0] = 45;
		notas[1][1] = 57;
		notas[1][2] = 60;

		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("----------------------");
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println("Valor da Matriz: " + notas[poslinha][poscoluna]);
			}
		}
		System.out.println("----------------------");

		String texto = " Kasf, Java, 90, 80, 70, 40";

		String[] valoresArray = texto.split(",");
		for (int pos = 0; pos < valoresArray.length; pos++) {
			System.out.println(valoresArray[pos]);
		}
	}

}
