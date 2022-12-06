package br.com.viniciusdornellas.agenda2.dto;

public class ContatoResponseDTO {
	
	private String mensagem;
	private int caracteres;
	private String nome_invertido;
	private int dias_vivivos;

	public int getDias_vivivos() {
		return dias_vivivos;
	}

	public void setDias_vivivos(long l) {
		this.dias_vivivos = (int) l;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getCaracteres() {
		return caracteres;
	}

	public void setCaracteres(int i) {
		this.caracteres = i;
	}

	public String getNome_invertido() {
		return nome_invertido;
	}

	public void setNome_invertido(String nome_invertido) {
		this.nome_invertido = nome_invertido;
	}

	
	
	

}
