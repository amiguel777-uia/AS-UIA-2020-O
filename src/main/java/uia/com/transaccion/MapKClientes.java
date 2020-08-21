package uia.com.transaccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapKClientes {
	
	private HashMap<String, KCliente> m_MapClientes;
	MapCuentasKCliente m_MapCuentas;
	

	public MapKClientes(ListaKClientes miListaKClientes) {
		
		m_MapClientes = new HashMap<String, KCliente>();
		 
		
		 List<InfoBancoUIA> misItems =  miListaKClientes.getItems();
		 Iterator<InfoBancoUIA> itemsIterator = misItems.iterator();
		 
		 int i=0;
		
		 // Enviar cuentas a Gestor de Cuentas 
		  while(itemsIterator.hasNext())
		  {
			  KCliente item = (KCliente) itemsIterator.next();
			  m_MapCuentas = new MapCuentasKCliente(item.getItems());
			  item.setM_MapCuentas(m_MapCuentas);
			  m_MapClientes.put(item.getName(), item);
	          System.out.println(i+".  " +  item.getName()+"\n");
	      }
          i++;
		  
	}


	public HashMap<String, KCliente> getMapClientes() {
		return m_MapClientes;
	}


	public HashMap<String, KCliente> getM_MapClientes() {
		return m_MapClientes;
	}


	public void setM_MapClientes(HashMap<String, KCliente> m_MapClientes) {
		this.m_MapClientes = m_MapClientes;
	}


	public MapCuentasKCliente getM_MapCuentas() {
		return m_MapCuentas;
	}


	public void setM_MapCuentas(MapCuentasKCliente m_MapCuentas) {
		this.m_MapCuentas = m_MapCuentas;
	}




	
}
