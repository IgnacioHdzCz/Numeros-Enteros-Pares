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
