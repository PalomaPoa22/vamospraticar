package br.atividade.main;

import java.util.Scanner;

import br.atividade.model.Senha;

public class SenhaTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		Senha verifica= new Senha();
		
		System.out.println("Digite senha ");
		String senha=sc.next();
		
		verifica.validaSenha(senha);
		sc.close();
	}

}
