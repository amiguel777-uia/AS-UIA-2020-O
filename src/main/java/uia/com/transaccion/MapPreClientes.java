package uia.com.transaccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapPreClientes {
	
	private HashMap<String, PreCliente> mapClientes;
	

	public MapPreClientes(ListaPreClientes miListaPreClientes) {
		
		mapClientes = new HashMap<String, PreCliente>();
		 
		
		 List<InfoBancoUIA> misItems =  miListaPreClientes.getItems();
		 Iterator<InfoBancoUIA> itemsIterator = misItems.iterator();
		 System.out.println("\n");
		 
		 int i=0;
		
		 // Enviar cuentas a Gestor de Cuentas 
		  while(itemsIterator.hasNext())
		  {
			  PreCliente item = (PreCliente) itemsIterator.next();
			  mapClientes.put(item.getName(), item);
	          System.out.println(i+".  " +  item.getName()+"\n");
	          i++;
	      }
		  
	}

	public HashMap<String, PreCliente> getMapClientes() {
		return mapClientes;
	}


	public void setMapClientes(HashMap<String, PreCliente> mapClientes) {
		this.mapClientes = mapClientes;
	}


	
}
