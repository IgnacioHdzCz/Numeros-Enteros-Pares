package aplicacion;

import control.Validar;

public class Aplicacion {

	public static void main(String[] args) {
		Validar validar = new Validar();

		int numeroingresado = validar.ingresarnumero();

		validar.validarnumero(numeroingresado);

	}

}
