package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe20 {
	/*
	 * Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer
	 * informada pelo usu�rio, fa�a um algoritmo/programa que mostre no v�deo uma
	 * mensagem informando ao usu�rio se a palavra digitada � pal�ndrome ou n�o.
	 * Obs; uma palavra � pal�ndrome quando lida de tr�s para frente fica igual a
	 * original, exemplos: ASA, MIRIM
	 */
	public static void main(String[] args) {
		String letraContrario = "";
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		

		for (int i = frase.length() - 1; i >= 0; i--) {
			letraContrario += frase.charAt(i);
		}
		
		if(frase.equals(letraContrario)) {
			JOptionPane.showMessageDialog(null, "A frase � palindrome");
		} else {
			JOptionPane.showMessageDialog(null, "A frase n�o � palindrome");	
		}
		
		

	}
}
