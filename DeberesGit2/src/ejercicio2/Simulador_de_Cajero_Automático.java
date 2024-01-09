package ejercicio2;

import java.util.Scanner;

public class Simulador_de_Cajero_Automático {

	public static void main(String[] args) {
		/*
		 * - Descripción: Desarrollar un simulador de cajero automático que permita
		 * retirar dinero, depositar y consultar saldo. El programa debe manejar cuentas
		 * múltiples con ID y contraseña. - Retos: Crear un sistema de autenticación,
		 * manejar el saldo de las cuentas, y realizar operaciones básicas de un cajero
		 * automático.
		 */

		System.out.println("Ingrese su id"); // instanciamos el scanner
		Scanner lector;
		lector = new Scanner(System.in);

		Scanner autentificacion;
		autentificacion = new Scanner(System.in);

		int[] ID;
		ID = new int[5];
		for (int i = 0; i < ID.length; i++) {
			ID[i] = lector.nextInt();
		}
		lector.close();
		int[] saldo = { 600, 550, 800, 1600, 3000 };
		saldo = new int[5];

		int[] contrasena = { 12345, 999, 666, 22082004 };
		contrasena = new int[5];

		System.out.println("Ingreseme su id y contraseña");
		int idU = autentificacion.nextInt();
		int contraU = autentificacion.nextInt();
		autentificacion.close();

		boolean contraexiste = false;
		boolean existe = false;
		int opcion;
		for (int i = 0; i < 5; i++) {
			int posicion = ID[i]; // obtenemos el valor en la posición i
			if (ID[i] == idU) {
				existe = true;
				i = 5;
			} else {
				existe = false;
				System.out.println("Error, o la ha escrito mal o no existe");
			}
		}

		for (int i = 0; i < 5; i++) {
			int cualContra = contrasena[i]; // obtenemos el valor en la posición i
			if (contrasena[i] == contraU) {
				contraexiste = true;
				i = 5;
			} else {
				contraexiste = false;
				System.out.println("Error, contraseña incorrecta");
			}
		}
		if (existe == true && contraexiste == true) {
			System.out.println(
					"Identificación completada, que operación quiere hacer? 1 para mostrar su sueldo, 2 para ingresar dinero a su cuenta, 3 para sacar dinero de su cuenta");
		}

	}

}
