import java.util.*;
public class cidades {

	public static void main(String[] args) {
		// Variaveis
		String cidades[] = new String[20];
		int distancias[] = new int[20];
		byte cont, x;
		float precoPassagem;
		int tempoVoo;
		boolean encontrou;
		byte contpesquisa;
		int numEscalas;
		String cidadePesquisa;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		for (cont = 0; cont < 20; cont ++) {
			do {
				System.out.println("Digite o nome da cidade (FIM para sair): ");
				cidades[cont] = leia.nextLine();
					if (cidades[cont].equals("")) {
						System.out.println("A cidade nao pode ficar em branco!");
					}
			}while(cidades[cont].equals(""));
				if (cidades[cont].equalsIgnoreCase("fim")) {
					break;
				}
				do {
					System.out.println("Digite a distancia da cidade em Km");
					distancias[cont] = leia.nextInt();
					if (distancias[cont] < 500) {
						System.out.println("O valor deve ser maior ou igual a 500");
					}
				}while(distancias[cont] < 500);
						//limpeza de buffer
						leia.nextLine();
		}

		do {
			System.out.println("Digite o nome da cidade(SAIR para finalizar)");
			cidadePesquisa =leia.nextLine();
			if (cidadePesquisa.equalsIgnoreCase("sair")) {
				break;
			}
			encontrou = false;
			for (x = 0; x < cont; x++) {
				if (cidadePesquisa.equalsIgnoreCase(cidades[x])) {
					encontrou = true;
					break;
				}
			}
			if (encontrou) {
				//calculos
				precoPassagem = (float)0.25 * distancias[x];
				tempoVoo = distancias[x] * 800 * 60;
				numEscalas = tempoVoo / 180;
				System.out.println("Preco da Passagem: " +precoPassagem);
				System.out.println("Tempo de Voo em minutos: " +tempoVoo);
				System.out.println("Numero de Escalas: " +numEscalas);
			} else {
				System.out.println("Nao ha voos para essa cidade");
			}
		}while (! cidadePesquisa.equalsIgnoreCase("sair"));
	}
}
