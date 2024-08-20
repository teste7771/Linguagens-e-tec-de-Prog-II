//importaçoes
import java.util.Scanner;
public class SALARIO {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		String nome;
		float salario;
		float novoSalario;
		float somaSalarios = 0;
		int contador1700 = 0;
		byte numDependentes;
		int i;
		
		//Entrada de dados
		for (byte x = 1; x <=10; x++) { //variavel for
		System.out.println("Digite o nome do empregado");
		nome = leia.nextLine();
			
		System.out.println("Digite o salario");
		salario = leia.nextFloat();
			
		System.out.println("Digite o numero de dependentes");
		numDependentes = leia.nextByte();
			
		//calculos
		if (salario < 1000) {
			novoSalario = (salario / 100 * 1.30f) + salario;	
		}else if (salario <=2000) {
			novoSalario = (salario / 100 * 1.20f) + salario;
		}else {
			novoSalario = (salario / 100 * 1.10f) + salario;
		}
		        novoSalario = novoSalario + (50* numDependentes);
			
			//impressao
		System.out.println("Novo Salario " + novoSalario);
		somaSalarios = somaSalarios + novoSalario;
		if (novoSalario > 1700) {
			contador1700++;
		}
			// Limpar buffer
			leia.nextLine();
			
		} // fim da variavel for
		System.out.println("Soma dos salarios" + somaSalarios);
		System.out.println("Numero de empregados que ganham acima de 1700 reais" + contador1700);
		System.out.println("Media dos salarios" +somaSalarios/10);
	}

}
