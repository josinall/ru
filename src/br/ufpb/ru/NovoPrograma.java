package br.ufpb.ru;
import java.util.Scanner;

public class NovoPrograma {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite N (quantidade de almo�os)");
		int N = Integer.parseInt(leitor.nextLine());
		System.out.println("Digite o pre�o do almo�o");
		double preco = Double.parseDouble(leitor.nextLine());
		double valorTotal = N*preco;
		System.out.printf("Valor total R$ %.2f\n", valorTotal);
		leitor.close();

	}

}
