package uia.com.transaccion;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


/**
 * @author amiguel
 * @version 1.0
 * @created 28-oct.-2019 05:09:06 p. m.
 */
public class GestorTransacciones {

	public servidorTelefonia m_servidorTelefonia;
	public Transaccion m_Transaccion;
	public GeneradorTransacciones miGeneradorTransacciones;
	

	public GestorTransacciones() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException	{
		this.miGeneradorTransacciones = new GeneradorTransacciones();
	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param idCuenta
	 * @param monto
	 * @param Receptor
	 */
	public void realizaTransaccion(int idCuenta, Double monto, Universidad miUniversidadTemp){
		//this.m_Transaccion = new Transaccion(idCuenta, monto, miUniversidadTemp);
		this.miGeneradorTransacciones.validaTransaccion(this.m_Transaccion);
		this.m_servidorTelefonia = new servidorTelefonia(this.m_Transaccion);
	}

	public servidorTelefonia getM_servidorTelefonia() {
		return m_servidorTelefonia;
	}

	public void setM_servidorTelefonia(servidorTelefonia m_servidorTelefonia) {
		this.m_servidorTelefonia = m_servidorTelefonia;
	}

	public Transaccion getM_Transaccion() {
		return m_Transaccion;
	}

	

	public GeneradorTransacciones getMiGeneradorTransacciones() {
		return miGeneradorTransacciones;
	}

	public void setMiGeneradorTransacciones(GeneradorTransacciones miGeneradorTransacciones) {
		this.miGeneradorTransacciones = miGeneradorTransacciones;
	}

	public void validaTransaccion(){

	}

	public void realizaTransaccion(int idCuenta, float monto, Universidad miUniversidadTemp) {
		//this.m_Transaccion = new Transaccion(idCuenta, monto, miUniversidadTemp);
		this.miGeneradorTransacciones.validaTransaccion(this.m_Transaccion);
	}
}//end GestorTransacciones