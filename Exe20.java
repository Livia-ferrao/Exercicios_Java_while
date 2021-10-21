package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe20 {
	/*
	 * Faça um algoritmo/programa que leia uma sequência de caracteres qualquer
	 * informada pelo usuário, faça um algoritmo/programa que mostre no vídeo uma
	 * mensagem informando ao usuário se a palavra digitada é palíndrome ou não.
	 * Obs; uma palavra é palíndrome quando lida de trás para frente fica igual a
	 * original, exemplos: ASA, MIRIM
	 */
	public static void main(String[] args) {
		String letraContrario = "";
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		

		for (int i = frase.length() - 1; i >= 0; i--) {
			letraContrario += frase.charAt(i);
		}
		
		if(frase.equals(letraContrario)) {
			JOptionPane.showMessageDialog(null, "A frase é palindrome");
		} else {
			JOptionPane.showMessageDialog(null, "A frase não é palindrome");	
		}
		
		

	}
}
