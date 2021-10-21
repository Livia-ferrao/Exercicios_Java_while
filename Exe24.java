package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe24 {
	/*
	 * Faça um algoritmo/programa que leia uma sequência de caracteres qualquer
	 * informada pelo usuário, faça um algoritmo/programa que troque qualquer
	 * ocorrência do caracter espaço em branco por um ponto (.).
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		String fraseNova = frase.replace(" ", ".");
		JOptionPane.showMessageDialog(null, fraseNova);
	}
}
