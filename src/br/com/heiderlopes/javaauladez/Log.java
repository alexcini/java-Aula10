package br.com.heiderlopes.javaauladez;

import java.io.FileWriter;
import java.io.IOException;

public class Log {

	public static void grava(String nomeArquivo, String texto) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("/home/heider/log/" + nomeArquivo, true);
			writer.write(texto);
			writer.write(System.lineSeparator());
		} catch (IOException ioe) {
			System.out.println(" Erro ao gravar o arquivo ");
			System.out.println(ioe);
		} finally {
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println(" Erro ao fechar o arquivo ");
				System.out.println(e);
			}
		}		
	}
}