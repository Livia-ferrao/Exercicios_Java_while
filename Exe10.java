package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe10 {
 /* 28) Escreva um algoritmo para calcular o reajuste salarial de uma empresa que possui vários funcionários,
cada um possuindo nome e salário (utilize cartão bandeira), de acordo com os seguintes critérios:
a) Os funcionários com salário inferior a 1.000,00 devem ter um reajuste de 40%;
b) Os funcionários com salário entre 1.000,00 (inclusive) e 3.000,00 (inclusive) devem ter um reajuste
de 30%;
c) Os funcionários com salário superior a 3.000,00 devem ter um reajuste de 20%*/
	
	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String nome = JOptionPane.showInputDialog("Informe o nome: ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));
			
			if(salario < 1000) {
				salario *= 1.4;
			} else if (salario >= 1000 && salario <= 3000) {
				salario *= 1.3;
			} else if (salario > 3000) {
				salario *= 1.2;
			}
			
			JOptionPane.showMessageDialog(null, nome + ", seu novo salário ficou de: " + salario);
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
	}
}
