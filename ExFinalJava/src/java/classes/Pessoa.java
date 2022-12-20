package java.classes;

public class Pessoa {
		
	private String nome;
	private String dataNasc;
	
	public Pessoa(String nome, String dataNasc) {
		
		this.nome = nome;
		this.dataNasc = dataNasc;
		
	}
	
	public String toString() {
		
		String retorno = new String();
		retorno = "Nome: " + nome + "Data de nascimento" + dataNasc;
		return retorno;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}
