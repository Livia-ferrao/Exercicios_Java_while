package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe04 {
	/*
	 * Peça para o usuário digitar um número inteiro positivo qualquer, digamos N.
	 * Após calcule N! Primeiro, utilize a estrutura de repetição enquanto, depois a
	 * estrutura de repetição repita.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		int fatorial = 1;
		String fat = "";

		while (continua == 'S') { 
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			for(int i =num; i>=1; i--) {
				if(i==1) {
					fat += i;
				} else {
					fat += i + " x ";	
				}
				fatorial *= i;
			}
			JOptionPane.showMessageDialog(null, fat + " = " + fatorial);
			fat = "";
			fatorial = 1;
			
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
		
		

	}
}
