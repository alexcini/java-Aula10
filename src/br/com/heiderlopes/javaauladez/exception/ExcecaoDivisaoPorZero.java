package br.com.heiderlopes.javaauladez.exception;

public class ExcecaoDivisaoPorZero extends ArithmeticException{
	
	private static final long serialVersionUID = -2417593585386349948L;

	public ExcecaoDivisaoPorZero (String mensagem) {
		super(mensagem);
	}

}
