package Curso;

import java.util.Scanner;

public class EjercicioGith {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		double minutos;

		horas_minutos();

		System.out.println(" digite los minutos que deseas convertir");
		minutos = scanner.nextDouble();

		System.out.println(minutos_segundos(minutos));
		

	}

	public static void horas_minutos() {
		Scanner ham = new Scanner(System.in);
		int hora;
		int convertir;
		System.out.println("digite la hora que deseas convertir ");
		hora = ham.nextInt();

		convertir = hora * 60;
		System.out.println(hora + " horas a minutos es: " + convertir + " minutos");

	}

	public static double minutos_segundos(double minutos) {

		double conversion = minutos * 60;

		return conversion;
	}
}
