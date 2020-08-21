package uia.com;


import uia.com.transaccion.*;
import java.io.FileNotFoundException;
import java.io.IOException;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;


public class App {
	private GestorServicios m_gestorServicios;


	public static void main(String[] args) throws JsonGenerationException, JsonProcessingException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hola UIA");
		System.out.println("Probando la generación de una transaccion de un servicio");

		GestorServicios m_gestorServicios = new GestorServicios();
		//m_gestorServicios.realizaServicio(int id, float monto, String tipo, String nombre, int receptor);
		//m_gestorServicios.realizaServicio((int)1, (float)300.0, "Debito", "Ahorro", 30);
		
		//GestorExpedientes miGestorExpedientes = new GestorExpedientes();
			//m_gestorServicios.realizaServicio((int)1, (float)300.0, (int)1, (int)5555);
		
		
		
		//GestorServicios m_gestorServicios = new GestorServicios();
		//m_gestorServicios.realizaServicio((int)1, (float)300.0, (int)1, (int)5555);
	}

}
