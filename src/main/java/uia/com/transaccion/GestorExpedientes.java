package uia.com.transaccion;

import java.io.FileNotFoundException;
import java.io.IOException;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;





/**
 * @author amiguel
 * @version 1.0
 * @created 12-nov.-2019 11:27:37 a. m.
 */
public class GestorExpedientes {

	private int cliente;
	private int opcion;
	public KardexListaPreClientes miKardexListaPreClientes;
	public ListaKClientes miKListaClientes;
	//public Expediente m_Expediente;
	public GestorClientes miGestorClientes;

	public GestorClientes getMiGestorClientes() {
		return miGestorClientes;
	}

	public void setMiGestorClientes(GestorClientes miGestorClientes) {
		this.miGestorClientes = miGestorClientes;
	}

	public GestorExpedientes() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException{
		
		//this.miKardexListaPreClientes = new KardexListaPreClientes();
		this.miGestorClientes = new GestorClientes();
	}

	public void finalize() throws Throwable {

	}
	
	public PreCliente buscaExpediente(int id)
	{
		return (this.miKardexListaPreClientes.buscaCliente(id));
	}

	/**
	 * 
	 * @param cliente
	 * @param opcion
	 */
	public void operacionListaClientes(int cliente, int opcion){

	}

	public Cuenta buscaCuenta(int id, String tipo, String nombre) {
		return this.miGestorClientes.buscaKCuenta(id, tipo, nombre);
	}
}//end Gestor_Expedientes