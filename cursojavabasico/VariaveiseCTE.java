package cursojavabasico;
/*
 * Classe deminstrativa de variáveis e ctes
 */
public class VariaveiseCTE {

	public static void main(String[] args) {
		//Criação de ctes
		final double ACELERACAO_GRAVIDADE_TERRA=9.800;
		
		//Ciração de variáveis

		String nome = "Marcos";
		
		int idade = 18;
		
		double peso=73.4,altura=1.73;
		
		char sexo='m',cnh='s';
		
		boolean doador=true;
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
		System.out.println("Sexo: "+sexo);
		System.out.println("CNH: "+cnh);
		System.out.println("Doador: "+doador);
		System.out.println("Gravidade da Terra:"+ACELERACAO_GRAVIDADE_TERRA+"m/s^2");
	}

}
