package br.ufpb.ru;

import java.util.Scanner;

public class Teste3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas refei��es foram servidas hoje?");
		int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
		RefeicaoRealizada[] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
		
		for (int k = 0; k < quantidadeRefeicoes; k++) {
			System.out.println("Matr�cula do(a) aluno(a) [" + (k + 1) + "]");
			String matricula = leitor.nextLine();
			System.out.println("Qual o tipo de refei��o? CAF�, ALMO�O ou JANTAR");
			String tipoRefeicao = leitor.nextLine();
			refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
			System.out.printf("%s\n", refeicoes[k].toString());
		}
// TODO: C�digo a acrescentar
		
		int quantidadeAlmocos = calculaQuantAlmocos(refeicoes);
		System.out.println("quantidade almo�os:"+ quantidadeAlmocos );
		
		if(teveCafe(refeicoes)){
			System.out.println("SIM");
		}else {
			System.out.println("N�O");
		}
		
		System.out.printf("FIM DO PROGRAMA");
		leitor.close();
	}// fim do main
	
	
	public static boolean teveCafe(RefeicaoRealizada [] refeicoes) {
		return false;
		//todo
	}


	public static int calculaQuantAlmocos(RefeicaoRealizada []refeicoes) {
		int quantAlmocos = 0;
		for(int  k=0;k< refeicoes.length; k++){
			if (refeicoes[k].getTipoRefeicao().equalsIgnoreCase("ALMO�O")) {
				quantAlmocos++;
		
			}
		return quantAlmocos;
		}
		
	}
		
} // fim da classe Teste 3
