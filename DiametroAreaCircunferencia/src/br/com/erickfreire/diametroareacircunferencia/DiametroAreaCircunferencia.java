package br.com.erickfreire.diametroareacircunferencia;

import java.util.Scanner;

public class DiametroAreaCircunferencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		double diametro;
		double circunferencia;
		double area;
		
		System.out.println("Programa que calcula o diametro, area e circunferencia de um circulo: ");
		System.out.print("Informe o raio do circulo: ");
		raio = entrada.nextDouble();
		
		diametro = 2 * raio;
		circunferencia = 2 * Math.PI * raio;
		area = Math.PI * (raio * raio);
		
		System.out.printf("Diametro: %.2f%nCircunferencia: %.2f%nArea: %.2f%n", diametro, circunferencia, area);

	}

}
