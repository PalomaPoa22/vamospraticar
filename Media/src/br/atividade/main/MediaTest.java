package br.atividade.main;

import br.atividade.model.Media;

public class MediaTest {

	public static void main(String[] args) {
		
		Media media= new Media();
		Media media1= new Media();
		System.out.println("---------------------------");
	    System.out.println("Teste aprovado");	
		double nota1=9;		
		double nota2=8;
		media.media(nota1,nota2);
		System.out.println("---------------------------");
		 System.out.println("Teste reprovado");	
		double nota3=5;		
		double nota4=5;
		media1.media(nota3, nota4);
		System.out.println("---------------------------");
		
	}

}
