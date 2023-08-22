package curso.java.exception;

public class ExceptionNota extends Exception {
	public ExceptionNota(String erro) {
		super("Erro ao processar dados da Nota: " + erro);
	}
}