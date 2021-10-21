package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe12 {
	/*
	 * Faça um algoritmo para ler o nome de uma quantidade indefinida de alunos
	 * (utilize cartão bandeira). Considere que cada aluno fez uma quantidade (X) de
	 * provas, onde cada aluno poderá ter feito um número diferente de provas, isto
	 * é, o valor (X) pode ser diferente entre os alunos. Mostre no final a média
	 * geral obtida por toda a turma. Peça para o usuário digitar o valor (X) de
	 * cada aluno.
	 */
	public static void main(String[] args) {
		int soma = 0;
		float media = 0;
		int i = 1;

		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
		while (i <= qt) {
			String nome = JOptionPane.showInputDialog("Nome do aluno: ");
			int provas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o/a " + nome + " fez? "));
			for (int j = 1; j <= provas; j++) {
				int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota da prova " + j + ": "));
				soma += nota;
			}
			media = (float) soma / provas;
			soma = 0;
			JOptionPane.showMessageDialog(null, "A média do aluno " + i + " é: " + media);
			i++;
		}
	}
}
