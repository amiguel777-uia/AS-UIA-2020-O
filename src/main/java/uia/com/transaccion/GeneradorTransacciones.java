package uia.com.transaccion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


 
/**
 * @author amiguel
 * @version 1.0
 * @created 28-oct.-2019 05:09:07 p. m.
 */
public class GeneradorTransacciones {

	private ListaTransacciones miListaTransacciones;
	private Transaccion m_transaccion;
	private int idTransaccion;

	public GeneradorTransacciones(Transaccion m_transaccion)
	{			
		this.setIdTransaccion(m_transaccion);
	}

	public GeneradorTransacciones() throws JsonProcessingException, JsonProcessingException, FileNotFoundException, IOException
	{
		
		com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
		 this.miListaTransacciones = new ListaTransacciones(); 
		 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 this.miListaTransacciones = mapper.readValue(new FileInputStream("C:\\TSU-UIA\\bancoUIA\\src\\main\\java\\uia\\com\\transaccion\\transaccion.json"), ListaTransacciones.class );

	}

	private int buscaUltimoId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void finalize() throws Throwable {

	}
	
	public void busca() 
	{
	}

	public void guarda(){
		
		ObjectMapper mapper = new ObjectMapper();
	      try
	      {
	         mapper.writeValue(new File("C:\\Java\\eclipse\\TransaccionUIA\\uia.com.transaccion\\uia\\com\\transaccion\\newtransacciones.json"), miListaTransacciones );
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }

	}
	
	public void getIdTransaccion(Transaccion m_Transaccion){
		
	}
	
	public void setIdTransaccion(Transaccion m_Transaccion)
	{
		this.idTransaccion = buscaUltimoId()+1;
		m_Transaccion.setIdtransaccion(this.idTransaccion);		
	}

	public void validaTransaccion(Transaccion transaccionTemp) 
	{
		//transaccionTemp.setFecharealizacion();
		transaccionTemp.setIdtransaccion(this.miListaTransacciones.getSize()+1);
		miListaTransacciones.agrega(transaccionTemp);
		miListaTransacciones.setSize(this.miListaTransacciones.getSize()+1);
		guarda();
	}

	

}//end generadorTransacciones