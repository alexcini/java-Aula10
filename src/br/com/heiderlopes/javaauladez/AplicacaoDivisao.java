package br.com.heiderlopes.javaauladez;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.heiderlopes.javaauladez.exception.ExcecaoDivisaoPorZero;

public class AplicacaoDivisao {	
	
	public static void main(String args[]) {
		double dividendo = 0, divisor = 0;
		try{
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe o dividendo: ");
			dividendo = entrada.nextDouble();
			System.out.println("Informe o divisor: ");
			divisor = entrada.nextDouble();
			
			System.out.println(Divisao.calcula(dividendo, divisor));
		} catch (ExcecaoDivisaoPorZero e) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Log.grava(sdf.format(new Date()) + ".log", "Dividendo: " +
			dividendo + " Divisor:" + divisor + " - " +  e.getMessage());
			System.out.println(e.getMessage());
		}
	}
}