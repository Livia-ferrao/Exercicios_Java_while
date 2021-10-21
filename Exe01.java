package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe01 {
	/*
	 * Fa�a um algoritmo para ler o nome, idade e sexo de um n�mero indeterminado de
	 * alunos. Ao final escreva a m�dia da idade dos homens e das mulheres lidos.
	 * Primeiro, utilize a estrutura de repeti��o enquanto, depois a estrutura de
	 * repeti��o repita.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		int qntMulher = 0;
		double totalIdadeM = 0;
		int qntHomem = 0;
		double totalIdadeH = 0;

		while (continua == 'S') {
			//String nome = JOptionPane.showInputDialog("Qual seu nome? ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
			char sexo = JOptionPane.showInputDialog("Qual seu sexo(F/M)? ").toUpperCase().charAt(0);
			
			if (sexo == 'F') {
				qntMulher++;
				totalIdadeM += idade;
			} else if (sexo == 'M') {
				qntHomem++;
				totalIdadeH += idade;
			}
			
			continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
		}
		
		double mediaM = (double) totalIdadeM/qntMulher;
		double mediaH = (double) totalIdadeH/qntHomem;
		
		JOptionPane.showMessageDialog(null, "A m�dia da idade dos homens � " + mediaH
				+ "/nA m�dia da idade das mulheres �: " + mediaM);
	}
}
