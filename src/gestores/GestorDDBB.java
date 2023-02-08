package gestores;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import objetos.Cliente;

public class GestorDDBB extends Conexion {
//clientes
	public void insertarClientes(Cliente cliente) {
		try {
			PreparedStatement preparedSt;

			preparedSt = cn.prepareStatement(
					"INSERT INTO clientes(dni, nombre, apellidos, direccion, localidad) VALUES (?,?,?,?,?)");

			preparedSt.setString(1, cliente.getDni());
			preparedSt.setString(2, cliente.getNombre());
			preparedSt.setString(3, cliente.getApellido());
			preparedSt.setString(4, cliente.getDireccion());
			preparedSt.setString(5, cliente.getLocalidad());

			preparedSt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarCliente(String DNI) {
		
		String EliminarCliente = "DELETE FROM clientes WHERE dni= ?";
		
		try {
			
			PreparedStatement stDelete = super.cn.prepareStatement(EliminarCliente);
			stDelete.setString(1, DNI);
			
			stDelete.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//TODO HAY QUE HACER EL METODO PARA PODER MODIFICAR LA INFO DEL CLEINTE
	
}
