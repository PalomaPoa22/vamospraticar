package br.atividade.model;

public class Media {

	private double nota1, nota2;

	public Media() {

	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void media(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		double notaFaltou = 7 - media;
		if (media > 7) {
			System.out.println("Aprovado - nota : " + media);
		} else {
			System.out.println("Reprovado - nota : " + media + " faltou " + notaFaltou + " pontos ");
		}
	}

	@Override
	public String toString() {
		return "Media [nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}

}
