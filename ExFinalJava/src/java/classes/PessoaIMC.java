package java.classes;

public abstract class PessoaIMC extends Pessoa {

	private double peso;
	private double altura;
	
	public PessoaIMC(String nome, String dataNasc, double peso, double altura) {
		super(nome, dataNasc);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double calculaIMC(double altura, double peso) {
		
		var imc = peso/(altura*altura);
		return imc;
	}
	
	public abstract String resultIMC(); 
	
	public String toString() {
		
		String retorno = new String();
		retorno = "Nome: "+ getNome() + "Data de Nascimento: " + getDataNasc() + "Peso: " + peso + "Altura: " + altura; 
		return retorno;
		
	}
}
