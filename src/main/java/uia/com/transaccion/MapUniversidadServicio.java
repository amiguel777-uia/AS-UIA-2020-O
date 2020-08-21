package uia.com.transaccion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class MapUniversidadServicio{

	private HashMap <Integer, Universidad> miMapUniversidad;
	private ListaUniversidad miListaUniversidad;
	
	public MapUniversidadServicio() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException 
	{
		 cargaReceptoresServicios();
		
		 Iterator<Universidad> UniversidadIterator = miListaUniversidad.getUniversidades().iterator();
		 System.out.println("\n");
						 
		 int i=0;
		 int j=0;
		 
		 miMapUniversidad = new HashMap<Integer, Universidad>();
		 int IdUniversidad;
		
		 // Enviar Universidad a Gestor de Universidad 
		  while(UniversidadIterator.hasNext())
		  {			
				  Universidad universidad =  UniversidadIterator.next();  
				  miMapUniversidad.put(universidad.getId(), universidad);
		          System.out.println(universidad.getId()+".  " +  universidad.getName()+"\n");
		          j++;				  
	       }
	}
	
	
	private void cargaReceptoresServicios() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		 this.miListaUniversidad = new ListaUniversidad(); 
		 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 this.miListaUniversidad = mapper.readValue(new FileInputStream("C:\\TSU-UIA\\bancoUIA\\src\\main\\java\\uia\\com\\transaccion\\Universidad.json"), ListaUniversidad.class );		
}


	public Universidad buscaUniversidad(int receptor) {
		return (miMapUniversidad.get(receptor));
	}


}
