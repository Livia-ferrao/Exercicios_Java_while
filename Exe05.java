package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe05 {
	/*
	 * Uma empresa que possui X funcion�rios precisa saber a m�dia de seus sal�rios.
	 * Fa�a um algoritmo para ler a quantidade de funcion�rios e o sal�rio de cada
	 * um e escrever a m�dia dos sal�rios. Primeiro, utilize a estrutura de
	 * repeti��o enquanto, depois a estrutura de repeti��o repita.
	 */
	public static void main(String[] args) {
		double media = 0;
		int qnt = 0;
		int i =1;
		double salario = 0;
		
		qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcion�rios tem? "));
		while (i <= qnt) { 
			salario +=Double.parseDouble(JOptionPane.showInputDialog("Qual o sal�rio do funcion�rio " + i +"? "));
			i++;
		}
		
		media = salario/qnt;
		JOptionPane.showMessageDialog(null, "A m�dia salarial �: " + media);
	}
}




//int confirm = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais um funcion�rio? ");
//if(confirm ==0) {
//	continua = 'S';
//} else {
//	continua = 'N';
//}
