package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe03 {
	/*
	 * Fa�a um algoritmo que pe�a para o usu�rio digitar dois valores inteiros
	 * positivos, digamos A e B. Ap�s calcule �A elevado ao expoente B�. Primeiro,
	 * utilize a estrutura de repeti��o enquanto, depois a estrutura de repeti��o
	 * repita.
	 */

	public static void main(String[] args) {
		int multi = 1;
		char continua = 'S';

		while (continua == 'S') {
			int num = Integer.parseInt(JOptionPane.showInputDialog("N�mero: "));
			int expoente = Integer.parseInt(JOptionPane.showInputDialog("Expoente: "));
			
			for(int i=1; i <=expoente; i++) {
				multi *= num;			
			}
			
			JOptionPane.showMessageDialog(null, num + " elevado a " + expoente + " �: "+ multi);
			
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
		
		

	}
}
