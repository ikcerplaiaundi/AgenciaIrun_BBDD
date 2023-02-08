package menu;

import java.util.Scanner;

import objetos.Cliente;

public class FormularioDatos {

	public static Cliente pedirNuevoCliente(Scanner sc) {

		Cliente cliente = new Cliente();

		System.out.println("Introduce tu DNI");
		cliente.setDni(sc.nextLine());

		System.out.println("Introduce tu nombre");
		cliente.setNombre(sc.nextLine());

		System.out.println("Introduce tu apellido");
		cliente.setApellido(sc.nextLine());

		System.out.println("Introduce tu direccion");
		cliente.setDireccion(sc.nextLine());

		System.out.println("Introduce tu localidad");
		cliente.setLocalidad(sc.nextLine());

		return cliente;
	}

	public static int pedirDNICliente(Scanner sc) {
		
		int DNICliente;

		System.out.println("Introduce el DNI que quieres eliminar");
		DNICliente = Integer.parseInt(sc.nextLine());
		
		return DNICliente;
		
	}

}
