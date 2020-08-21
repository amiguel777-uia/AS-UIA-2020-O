package uia.com.transaccion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


/**
 * @author amiguel
 * @version 1.0
 * @created 28-oct.-2019 05:09:06 p. m.
 */
public class GestorServicios {
	
	private PreCliente miPreCliente;
	private GestorExpedientes miGestorExpedientes;
	public GestorTransacciones miGestorTransacciones;
	public MapUniversidadServicio miMapUniversidad;

	public GestorServicios() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException {
		this.miGestorExpedientes = new GestorExpedientes();
		this.miGestorTransacciones = new GestorTransacciones();
		this.miMapUniversidad = new MapUniversidadServicio();
	}

	

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param idCliente o idCuenta
	 * @param monto
	 * @param idReceptor
	 * @param celular
	 */
	public void realizaServicio(int idCuenta, Double monto, String tipo, String nombre, int receptor)
	{
		this.miPreCliente = this.miGestorExpedientes.buscaExpediente(idCuenta);
		Universidad miUniversidadTemp = this.miMapUniversidad.buscaUniversidad(receptor);
		Cuenta cuentaTemp = null;
		
		if(this.miPreCliente != null && miUniversidadTemp != null)
		{
			cuentaTemp = this.miGestorExpedientes.buscaCuenta(idCuenta, tipo, nombre);
			if(cuentaTemp != null && this.miGestorTransacciones != null)
			{
				this.miGestorTransacciones.realizaTransaccion(idCuenta, monto, miUniversidadTemp);
				//cuentaTemp.setSaldo(cuentaTemp.getSaldo()-monto);
				miGestorExpedientes.getMiGestorClientes().guarda();
			}
		}
	}
}//end GestorServicios