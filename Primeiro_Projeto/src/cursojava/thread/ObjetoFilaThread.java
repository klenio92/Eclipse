package cursojava.thread;

import java.util.Objects;

public class ObjetoFilaThread {

	private String Nome;
	private String email;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Nome, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoFilaThread other = (ObjetoFilaThread) obj;
		return Objects.equals(Nome, other.Nome) && Objects.equals(email, other.email);
	}

}
