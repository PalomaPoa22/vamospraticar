package br.atividade.model;

public class Senha {

	private String senha;

	public Senha() {
		super();
	}

	public String getSenha() {
		return senha;
	}

	

	public void validaSenha(String senha) {
		String verifica = "PORTUGOL";
		if (verifica.equalsIgnoreCase(senha)) {
			System.out.println("Senha valida ");
		} else {
			System.out.println("Senha invalida");
		}

	}

}
