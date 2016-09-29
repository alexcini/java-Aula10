package br.com.heiderlopes.javaauladez;

import javax.swing.JOptionPane;

import br.com.heiderlopes.javaauladez.exception.ExcecaoDivisaoPorZero;

public class Divisao {
	
	public static void main(String args[]) {
		
		int dividendo, divisor;
		while(true) {
			try{
				dividendo = Integer.parseInt(
						JOptionPane.showInputDialog("Informe o dividendo: "));
				
				divisor = Integer.parseInt(
						JOptionPane.showInputDialog("informe o divisor"));
				
				JOptionPane.showMessageDialog(null, dividendo/divisor);
				break;
			} catch(ArithmeticException ae) {
				JOptionPane.showMessageDialog(null, 
						"Nao pode dividir por 0 seu cabaço." + ae.getMessage());
			}  catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, 
						"Informe um numero seu cabaço.");
			}
		}
		
	}
	
	public static double calcula(double dividendo, double divisor) throws ExcecaoDivisaoPorZero {
		if(divisor == 0) {
			throw new ExcecaoDivisaoPorZero("Não pode dividir por zero seu cabaco");
		} else {
			return dividendo/divisor;
		}
	}
}
