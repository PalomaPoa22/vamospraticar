package br.atividade.main;

import br.atividade.model.Numero;

public class NumeroTest {

	public static void main(String[] args) {

		Numero verificaNumero = new Numero();

		for (int i = 0; i < 25; i++) {

			verificaNumero.limitador(i);
		}

	}

}
