# Numeros-Enteros-Pares
Descripción:
El usuario ingresara un número entero y la aplicación dira si es par o impar, el diagrama de flujo queda de la siguiente manera:


![image](https://user-images.githubusercontent.com/41167366/46489269-cf900700-c7b9-11e8-8b07-da44acab0fe0.png)



Creamos una nuevo proyecto de Java SE el nombre de los packages y clases quedara de la siguiente
manera:

![image](https://user-images.githubusercontent.com/41167366/46487420-c94b5c00-c7b4-11e8-9057-50de4e3dfe2c.png)


Creamos la siguiente clase con los respectivos atributos y métodos.

package modelo;

public class NumEntero {

	private int numero;
  
	public NumEntero() {
  
	}
  
	public NumEntero(int numero) {	
		this.numero = numero;
	}
  
	public int getNumero() {
		return numero;
	}
  
	public void setNumero(int numero) {
		this.numero = numero;
	}
  
}


La clase Validar queda de la siguiente forma:

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
				StringBuilder mensaje = new StringBuilder();
				mensaje.append("\n");
				mensaje.append("El numero es par ");
				mensaje.append("\n");
				mensaje.append("Fin de la ejecución");
				System.out.print(mensaje.toString());
				
			} else {
				StringBuilder mensaje = new StringBuilder();
				mensaje.append("\n");
				mensaje.append("El numero es impar ");
				mensaje.append("\n");
				mensaje.append("Fin de la ejecución");
				System.out.print(mensaje.toString());
				
				
			}

		} else if (dato < 0) {
			
		
			StringBuilder mensaje = new StringBuilder();
			mensaje.append("\n");
			mensaje.append("El numero es negativo ");
			mensaje.append("\n");
			mensaje.append("Fin de la ejecución");
			System.out.print(mensaje.toString());
		}

		return dato;
	}

}


Por último la clase aplicación:

package aplicacion;

import control.Validar;

public class Aplicacion {

	public static void main(String[] args) {
		Validar validar = new Validar();

		int numeroingresado = validar.ingresarnumero();

		validar.validarnumero(numeroingresado);

	}

}


Casos de uso
1.- Ingresamos un número multiplo de 2, por ejemplo el 8.
![image](https://user-images.githubusercontent.com/41167366/46490130-036c2c00-c7bc-11e8-82f5-026504574616.png)

2.- Ingresamos un número que no es multiplo de 2, por ejemplo el 3.

![image](https://user-images.githubusercontent.com/41167366/46490166-1a128300-c7bc-11e8-9c57-d63bb784efb7.png)

3.- Ingresamos un número negativo, por ejemplo el -9

![image](https://user-images.githubusercontent.com/41167366/46490201-39111500-c7bc-11e8-85e9-4a9125c02e8b.png)
