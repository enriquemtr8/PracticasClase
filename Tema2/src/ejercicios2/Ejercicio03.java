package ejercicios2;

public class Ejercicio03 {

	public static void main(String[] args) {

		int i = 0;
		double potencia = 1;
		
		do {
			
			i++;
			System.out.println(potencia);
			potencia = 	Math.pow(3, i);
			

		} while (potencia < 12000);

	}

}