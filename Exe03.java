package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe03 {
	/*
	 * Faça um algoritmo que peça para o usuário digitar dois valores inteiros
	 * positivos, digamos A e B. Após calcule “A elevado ao expoente B”. Primeiro,
	 * utilize a estrutura de repetição enquanto, depois a estrutura de repetição
	 * repita.
	 */

	public static void main(String[] args) {
		int multi = 1;
		char continua = 'S';

		while (continua == 'S') {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
			int expoente = Integer.parseInt(JOptionPane.showInputDialog("Expoente: "));
			
			for(int i=1; i <=expoente; i++) {
				multi *= num;			
			}
			
			JOptionPane.showMessageDialog(null, num + " elevado a " + expoente + " é: "+ multi);
			
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
		
		

	}
}
