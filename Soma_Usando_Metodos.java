import java.util.*;
public class metodos {

	public static void main(String[] args) {
		//variaveis(1)
		int a, b, c;
		int resultado;
		Scanner leia = new Scanner(System.in);

		//Entrada de dados(2)
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();

		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();

		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();

		resultado = somarInteirosEntreAeB(a, b);//equacao de soma de A e B(5)
		System.out.println("A Soma dos valores entre A e B é: " + resultado); //exibicao do resultado(6)
		
		exibirInteirosEntreAeBDivisiveisPorC(a, b, c);
		
		System.out.println("O percentual de C em relacao ao A é: " +percentualdeCemRelacaoAoA(c, a));
	}

	//Metodo(3)
	public static int somarInteirosEntreAeB (int valorA, int valorB) {
		int soma = 0;
		for (int x = valorA + 1; x <= valorB - 1; x++) {
			soma = soma + x;
		}
		return soma; //retorno de soma entre A e B(4)
	}
	public static void exibirInteirosEntreAeBDivisiveisPorC (int valorA, int valorB, int valorC) {
		for (int x = valorA + 1; x <= valorB -1; x++) {
			if (x % valorC == 0) {
				System.out.println("O numero " + x + " é divisivel por " +valorC);
			}
		}
	}
	public static float percentualdeCemRelacaoAoA (int varC, int varA) {
		float calculo;
		calculo = varC * 100 / varA;
		return calculo;
	}
}	
