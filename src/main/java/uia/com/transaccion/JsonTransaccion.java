package uia.com.transaccion;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
/**
 * @author amiguel
 * @version 1.0
 * @created 28-oct.-2019 05:09:07 p. m.
 */
public class JsonTransaccion {

	private Transaccion m_transaccion;
	private ObjectMapper mapper = new ObjectMapper();
	//private File 
	
	public JsonTransaccion(Transaccion m_transaccion){
		
		this.m_transaccion = m_transaccion;

	}

	public void finalize() throws Throwable {

	}
	public void busca(){

	}

	public void guarda(){
		
	      try
	      {
	         mapper.writeValue(new File("c:/temp/Transaccion.json"), m_transaccion);
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
	      
	private void writeJSON(Transaccion transaccion) throws JsonGenerationException,
	JsonMappingException, IOException{
		mapper.writeValue(new File("transaccion.json"), transaccion);
	}
	
	private Transaccion readJSON() throws JsonParseException, JsonMappingException,
	IOException{
		Transaccion student = mapper.readValue(new File("student.json"), Transaccion.class);
		return m_transaccion;
	}

	
}//end generadorTransacciones