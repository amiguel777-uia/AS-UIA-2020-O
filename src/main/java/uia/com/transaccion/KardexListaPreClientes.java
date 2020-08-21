package uia.com.transaccion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;





/**
 * @author amiguel
 * @version 1.0
 * @created 12-nov.-2019 11:27:37 a. m.
 */
public class KardexListaPreClientes {

	private int opcion;
	private ObjectMapper mapper = new ObjectMapper();		
	//public Validador m_Validador;
	public ListaPreClientes miListaPreClientes;
	HashMap<Integer, PreCliente> miMap;

	public KardexListaPreClientes() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException 
	{				
		if(mapper == null)
			System.out.println("Error");
		
			
		 //Read from file
		 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 miListaPreClientes = mapper.readValue(new FileInputStream("C:\\Java\\eclipse\\miBancoUIA\\src\\uia\\com\\transaccion\\listaPreClientes.json"), ListaPreClientes.class );
		 //System.out.println("Name:"+miListaPreClientes.getName()+", Vill."+ miListaPreClientes.getItems());
		 
		 miMap = new HashMap<Integer, PreCliente>();
		 
		 /*
		 ArrayList<PreCliente> misItems = miListaPreClientes.getItems();
		 Iterator<PreCliente> itemsIterator = misItems.iterator();
		 System.out.println("\n");
		 
		 int i=0;
			
		  while(itemsIterator.hasNext())
		  {
			  PreCliente item = itemsIterator.next();
			  miMap.put(item.getId(), item);
	          System.out.println(i+".  " +  item.getName()+"\n");
	          i++;
	       }
	       */
	}

	public void finalize() throws Throwable {

	}
	
	public void actualiza(){

	}

	public PreCliente buscaCliente(int id)
	{
		if(this.miMap.containsKey(id))
			return this.miMap.get(id);
		else
			return null;
	}
		
	
	
}//end KardexListaClientes