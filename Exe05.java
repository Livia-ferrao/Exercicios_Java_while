package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe05 {
	/*
	 * Uma empresa que possui X funcionários precisa saber a média de seus salários.
	 * Faça um algoritmo para ler a quantidade de funcionários e o salário de cada
	 * um e escrever a média dos salários. Primeiro, utilize a estrutura de
	 * repetição enquanto, depois a estrutura de repetição repita.
	 */
	public static void main(String[] args) {
		double media = 0;
		int qnt = 0;
		int i =1;
		double salario = 0;
		
		qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários tem? "));
		while (i <= qnt) { 
			salario +=Double.parseDouble(JOptionPane.showInputDialog("Qual o salário do funcionário " + i +"? "));
			i++;
		}
		
		media = salario/qnt;
		JOptionPane.showMessageDialog(null, "A média salarial é: " + media);
	}
}




//int confirm = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais um funcionário? ");
//if(confirm ==0) {
//	continua = 'S';
//} else {
//	continua = 'N';
//}
