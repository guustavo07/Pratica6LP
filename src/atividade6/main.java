package atividade6;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
			public static void main(String[] args) throws IOException  {
				String path="";
				//Path dir = Paths.get("C:", "teste");

				
				//Path path = dir.resolve("AulaLP.doc");
				
				//System.out.println(path);
				//ManipuladorArquivo.escritor(path.toString());
				//ManipuladorArquivo.leitor(path.toString());
				
				
				Scanner ler = new Scanner(System.in);
		        int options;
		        do{
		            System.out.println("1- Definir caminho e nome de Arquivo TXT para gravação \n2- Cadastrar Projeto \n3- Abrir Arquivo do Projeto \n4- Sair");
		            options=ler.nextInt();
		            switch(options){
		                case 1:
		                    System.out.println("Informe o nome: ");
		                    path=ler.next();
		                    break;
		                case 2:
		                	ManipuladorArquivo.escritor(path);
		                   	break;
		                case 3:
		                    ManipuladorArquivo.leitor(path);
		                    break;
		                    
		                case 4:
		                    break;
		            }
		        }while(options!=4);
			}
	}

