package control;

import java.util.Scanner;

import modelo.NumEntero;

public class Validar {

	public int ingresarnumero() {

		int valornumerico;
		int recuperanumero;

		Scanner ingreso = new Scanner(System.in);
		System.out.print("Ingresa un numero mayor de cero: ");
	
		valornumerico = ingreso.nextInt();
		ingreso.close();

		NumEntero numentero = new NumEntero();

		numentero.setNumero(valornumerico);

		recuperanumero = numentero.getNumero();

		return recuperanumero;

	}

	public int validarnumero(int numero) {
		int dato = numero;

		if (dato > 0) {

			if (dato % 2 == 0) {
				System.out.println("\n");
				System.out.println("El numero es par");
			} else {
				System.out.println("\n");
				System.out.println("El numero es impar");
			}

		} else if (dato < 0) {
			System.out.println("\n");
			System.out.println("El numero es negativo");

		}

		return dato;
	}

}
