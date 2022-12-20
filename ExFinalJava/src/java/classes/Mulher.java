package java.classes;

public class Mulher extends PessoaIMC{

	public Mulher(String nome, String dataNasc, double peso, double altura) {
		super(nome, dataNasc, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resultIMC() {
		// TODO Auto-generated method stub
		calculaIMC(getAltura(),getPeso());
		double imc = calculaIMC(getAltura(),getPeso());
		String mensagem;
		if (imc < 19) {
			mensagem = "Abaixo do peso ideal";
		} else if (imc > 19 & imc < 25.8) {
			mensagem = "Peso ideal";
		} else {
			mensagem = "Acima do peso ideal";
		}
		return mensagem;
	}

}
