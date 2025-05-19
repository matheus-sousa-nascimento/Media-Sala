/*
 * MediaSala.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MediaSala {
	
	public static void main (String[] args) {
		//Matheus de sousa do nascimento
		
		Scanner entrada = new Scanner(System.in);
		
		int nAlunos, x=0;
		double notaAlunos, soma=0, mediaSala;
		
		System.out.print("Digite quantos alunos tem na sala: ");
		nAlunos = entrada.nextInt();
		
		do{
			x++;
			System.out.print("Digite a nota dos alunos: ");
			notaAlunos = entrada.nextInt();
			soma += notaAlunos;
		}while(x < nAlunos);
		
		mediaSala = soma / nAlunos;
		System.out.print("A media da sala e "+ mediaSala);
	}
}

