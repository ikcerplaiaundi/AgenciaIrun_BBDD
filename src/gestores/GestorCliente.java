package gestores;

import java.util.Scanner;

import menu.FormularioDatos;
import menu.Menu;
import objetos.Cliente;

public class GestorCliente {

	/**
	 * @param sc
	 */
	public static void run(Scanner sc) {

		GestorDDBB gestorDDBB = new GestorDDBB();
		
		
		int opcCliente;

		do {

			Menu.menuClientes();

			opcCliente = Integer.parseInt(sc.nextLine());

			while (opcCliente < Menu.SALIR || opcCliente > Menu.VISUALIZAR_CLIENTE) {
				
				System.out.println("!Error¡ Introduce un valor valido");

				Menu.menuClientes();

				opcCliente = Integer.parseInt(sc.nextLine());
			}
			
			switch (opcCliente) {
			case Menu.INSERTAR_CLIENTE:
				
				Cliente cliente = new Cliente();
				
				gestorDDBB.abrirConexion();
				cliente = FormularioDatos.pedirNuevoCliente(sc);
				gestorDDBB.insertarClientes(cliente);
				gestorDDBB.cerrarConexion();
				
				
				break;
				
			case Menu.ELIMINAR_CLIENTE:
				
				String DNI;
				
				gestorDDBB.abrirConexion();
				DNI = FormularioDatos.pedirDNICliente(sc);
				gestorDDBB.eliminarCliente(DNI);
				gestorDDBB.cerrarConexion();
				
				break;
			
			case Menu.MODIFICAR_CLIENTE:
				
				String DNI_mod;
				
				gestorDDBB.abrirConexion();
				DNI_mod = FormularioDatos.modCliente(cliente, sc);
				gestorDDBB.
				
				
				break;
				
			case Menu.VISUALIZAR_CLIENTE:
				
				break;
				
			case Menu.SALIR:
				System.out.println("--------------VOLVIENDO------------------");
				break;
			}

		} while (opcCliente != Menu.SALIR);
	}
}
