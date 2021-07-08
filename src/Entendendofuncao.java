
public class Entendendofuncao {

	public static void saudacao() {
		System.out.println("Olá, tudo bem?");
	}
	
	public static void elogia(String nome) {
		System.out.println("Você é muito legal, " + nome);
		nome = "";
		System.out.println("Este código está na main DEPOIS de chamar a função");
	}
	
	public static void main(String[] args) {
		System.out.println("Este código está na main ANTES de chamar a função");
		saudacao();//chamada à função
		saudacao();
		saudacao();
		saudacao();
		System.out.println("Este código está na main DEPOIS de chamar a função");
		elogia("Lucas");
		String identificacao="Darth Vader";
		elogia(identificacao);
		System.out.println("Aqui na main, a variável identificacao contém " + identificacao);

	}

}
