package java.classes;

public class Homem extends PessoaIMC{

	public Homem(String nome, String dataNasc, double peso, double altura) {
		super(nome, dataNasc, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resultIMC() {
		// TODO Auto-generated method stub
		double imc = calculaIMC(getAltura(),getPeso());
		String mensagem;
		if (imc < 20.7) {
			mensagem = "Abaixo do peso ideal";
		} else if (imc > 20.7 & imc < 26.4) {
			mensagem = "Peso ideal";
		} else {
			mensagem = "Acima do peso ideal";
		}
		return mensagem;
	}
	
	

}
