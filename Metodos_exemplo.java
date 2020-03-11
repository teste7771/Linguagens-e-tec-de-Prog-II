import java.util.*;
public class metodos {

	//variaveis globais(1)
	static int x,y;
	
	public static void main(String[] args) {
		//variaveis(2)
		x = 10;
		y = 50;
		subtrai(); // metodo criado(3)
		System.out.println("O valor de X é: "+x); // resultado dos valores novos das variaveis(6)
		System.out.println("O valor de Y é: "+y);

	}
	//metodo declarado(4)
	public static void subtrai() {
		x = x-5; //valores novos das variaveis globais(5)
		y = y-8;
	}
}
