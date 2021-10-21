package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe10 {
 /* 28) Escreva um algoritmo para calcular o reajuste salarial de uma empresa que possui v�rios funcion�rios,
cada um possuindo nome e sal�rio (utilize cart�o bandeira), de acordo com os seguintes crit�rios:
a) Os funcion�rios com sal�rio inferior a 1.000,00 devem ter um reajuste de 40%;
b) Os funcion�rios com sal�rio entre 1.000,00 (inclusive) e 3.000,00 (inclusive) devem ter um reajuste
de 30%;
c) Os funcion�rios com sal�rio superior a 3.000,00 devem ter um reajuste de 20%*/
	
	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String nome = JOptionPane.showInputDialog("Informe o nome: ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio: "));
			
			if(salario < 1000) {
				salario *= 1.4;
			} else if (salario >= 1000 && salario <= 3000) {
				salario *= 1.3;
			} else if (salario > 3000) {
				salario *= 1.2;
			}
			
			JOptionPane.showMessageDialog(null, nome + ", seu novo sal�rio ficou de: " + salario);
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
	}
}
