package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Professor extends Pessoa implements PermitirAcesso {

	@Override
	public double notaParaFaculdade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
}