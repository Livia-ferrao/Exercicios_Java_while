package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe12 {
	/*
	 * Fa�a um algoritmo para ler o nome de uma quantidade indefinida de alunos
	 * (utilize cart�o bandeira). Considere que cada aluno fez uma quantidade (X) de
	 * provas, onde cada aluno poder� ter feito um n�mero diferente de provas, isto
	 * �, o valor (X) pode ser diferente entre os alunos. Mostre no final a m�dia
	 * geral obtida por toda a turma. Pe�a para o usu�rio digitar o valor (X) de
	 * cada aluno.
	 */
	public static void main(String[] args) {
		int soma = 0;
		float media = 0;
		int i = 1;

		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos s�o? "));
		while (i <= qt) {
			String nome = JOptionPane.showInputDialog("Nome do aluno: ");
			int provas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o/a " + nome + " fez? "));
			for (int j = 1; j <= provas; j++) {
				int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota da prova " + j + ": "));
				soma += nota;
			}
			media = (float) soma / provas;
			soma = 0;
			JOptionPane.showMessageDialog(null, "A m�dia do aluno " + i + " �: " + media);
			i++;
		}
	}
}
