package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe08 {
	/*
	 * Fa�a um algoritmo para ler o nome de uma quantidade indefinida de alunos,
	 * usando cart�o bandeira. Considere que cada aluno fez tr�s provas, por isso
	 * para cada aluno dever� ser digitado tamb�m, alem de seu nome, as suas tr�s
	 * notas.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		
		while (continua == 'S') {
			String nome = JOptionPane.showInputDialog("Nome: ");
			
			double a1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));
			double a2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
			double a3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3: "));

			JOptionPane.showMessageDialog(null, nome + " tem como notas: " + a1 + ", " + a2 + ", " + a3);

			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}

	}
}
