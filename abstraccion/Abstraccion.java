package Curso;

import java.util.Scanner;

public class Abstraccion {

	public double Calcular_RaizCuadrada() {

		Scanner entrance = new Scanner(System.in);

		System.out.println("digite un numero");
		double number = entrance.nextDouble();

		return Math.sqrt(number);
	}
}
