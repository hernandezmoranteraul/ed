package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
//		double doubleAleatorio = Math.random() *1000;
		//	int numeroAleatorio = (int)doubleAleatorio +1;
			Scanner scanner = new Scanner (System.in);
			Random random = new Random();
			int numeroAleatorio = random.nextInt(1000) + 1;
			System.out.println("numeroAleatorio=" + numeroAleatorio);
			int minimo = 1;
			int maximo = 1000;
			int contadorIntentos = 0;
			System.out.println("Adivina entre un número (entre 1 y 1000:) ");
			int numeroIntroducido = Integer.parseInt(scanner.nextLine());
			while (numeroIntroducido != numeroAleatorio ) {
				if (numeroIntroducido < numeroAleatorio ) {
						System.out.println("Es mayor que ese");
						minimo = numeroIntroducido + 1;
			} else {
				System.out.println("Es menor que ese) ");	
				maximo = numeroIntroducido -1;
			}
				contadorIntentos++;
				System.out.println("Adivina un número (entre" + minimo + "y" + maximo + ")"+ "[intentos] " + contadorIntentos);
				numeroIntroducido = Integer.parseInt(scanner.nextLine());
			}
			System.out.println("Enhorabuena has encontrado el número");
					

		}

	}


	}

}
