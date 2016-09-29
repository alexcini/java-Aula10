package br.com.heiderlopes.javaauladez;

import java.io.FileWriter;
import java.io.IOException;

import br.com.heiderlopes.javaauladez.exception.ExcecaoTextoInvalido;

public class Arquivo {
	
	public static void gravar(String texto) throws IOException, ExcecaoTextoInvalido{
		
		if(texto == null || texto.trim().equals("")) {
			throw new ExcecaoTextoInvalido("Texto invalido");
		} else {
			FileWriter writer = new FileWriter("/home/heider/log.txt", true);
			writer.write(texto);
			writer.write(System.lineSeparator());
			writer.close();
		}
		System.out.println("Arquivo gravado com sucesso!");
	}

	public static void main(String args[]) {
		try {
			gravar("Exemplo de tratamento de excecao");
		} catch(IOException io) {
			io.printStackTrace();
		} catch(ExcecaoTextoInvalido eti) {
			eti.printStackTrace();
		}
	}
}
