import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡Escribe dos números y te diré el resto de " + "la división!");

		System.out.println("Primer número");

		int num1 = entrada.nextInt();

		System.out.println("Segundo número");

		int num2 = entrada.nextInt();

		int resto = num1 % num2;

		System.out.println("Resto: " + resto);

	}

}