package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe16 {
	/*
	 * Faça um algoritmo/programa que leia uma quantidade N de palavras, após cada
	 * leitura escreva o tamanho da mesma.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Palavra: ");
			
			JOptionPane.showMessageDialog(null, palavra.length());

			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
	}
}
