package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe11 {
	
	/*11) Uma empresa possui uma s�rie de N funcion�rios (utilize cart�o bandeira), dos quais � conhecido:
nome, idade e sexo. Fa�a um algoritmo que imprima:
a) A m�dia da idade dos homens;
b) A m�dia da idade das mulheres;
c) A m�dia da idade das pessoas com mais de 18 anos;*/
	
	public static void main(String[] args) {
		char continua = 'S';
		int qntMulher = 0;
		double totalIdadeM = 0;
		int qntHomem = 0;
		 double totalIdadeH = 0;
		 int somaIdades = 0;
		 int qntIdades = 0;

		while (continua == 'S') {
			//String nome = JOptionPane.showInputDialog("Qual seu nome? ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
			char sexo = JOptionPane.showInputDialog("Qual seu sexo(F/M)? ").toUpperCase().charAt(0);
			
			if (sexo == 'F') {
				qntMulher++;
				totalIdadeM += idade;
			} else if (sexo == 'M') {
				qntHomem++;
				totalIdadeH += idade;
			}
			
			if(idade>18) {
				qntIdades += 1;
				somaIdades += idade;
			}
			
			continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
		}
		
		double mediaM = (double) totalIdadeM/qntMulher;
		double mediaH = (double) totalIdadeH/qntHomem;
		double mediaIdade = (double) somaIdades/qntIdades;
		
		JOptionPane.showMessageDialog(null, "A m�dia da idade dos homens � " + mediaH
				+ "/nA m�dia da idade das mulheres �: " + mediaM + "/nA m�dia das pessoas com menos 18 anos � " + mediaIdade);
	}
}
