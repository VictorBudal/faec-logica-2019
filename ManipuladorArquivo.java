import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

//writer import
import java.io.PrintWriter;
import java.io.File;

public class ManipuladorArquivo{
	

	public static void main (String[]args) throws IOException {
		
		// Cria/abre um arquivo de nome nome.txt
		Path file = Paths.get("Victor.txt");
		
		// Escreve uma String "Primeira linha" no arquivo
		Files.write(file, "Primeira  linha ".getBytes());
		
		// Escreve uma String "Segunda linha" no arquivo
		Files.write(file," Segunda linha".getBytes(),StandardOpenOption.APPEND);
		
		//StandardOpenOption.APPEND ele deixa o que ta la e escreve junto, sem ele o arquivo ele vai subescrever.
		
		//Apagando o arquivo
		Files.delete(file);
		
		PrintWriter writer = new PrintWriter(new File("turma.txt"));
		
		// Cria/abre um arquivo de nome nome.txt 
		writer.println("Primeira inha");
		writer.println("Segunda linha");
		
		// Escrever número de 0 a 100 no arquivo numeros 
		// numeros.txt. Um numero em cada linha.
		
		
		PrintWriter arquivos = new PrintWriter(new File("numeros.txt"));
		
		for(int i = 0 ; i<100 ; i++){
			//String top = Integer.parseInt(i);
			
			arquivos.println(i+1);
			
		}
		
		
		
		arquivos.close();
		
		writer.close();
		
		
		
	}


}