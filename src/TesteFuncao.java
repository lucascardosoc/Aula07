
public class TesteFuncao {

	public static void main(String[] args) {
		double v1=10, v2=50;
		double resultado;
		resultado = FuncoesMatematicas.somarComReturn(v1, v2);
		System.out.println(resultado);
		
		FuncoesMatematicas.dividir(FuncoesMatematicas.somarComReturn(v1,  v2), 3);
	}

}
