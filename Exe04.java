package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe04 {
	/*
	 * Pe�a para o usu�rio digitar um n�mero inteiro positivo qualquer, digamos N.
	 * Ap�s calcule N! Primeiro, utilize a estrutura de repeti��o enquanto, depois a
	 * estrutura de repeti��o repita.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		int fatorial = 1;
		String fat = "";

		while (continua == 'S') { 
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
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
