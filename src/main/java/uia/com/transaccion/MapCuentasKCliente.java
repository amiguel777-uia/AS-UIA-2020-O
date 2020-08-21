package uia.com.transaccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapCuentasKCliente {

	private HashMap <String, Producto> m_MapCuentas;
	
	public MapCuentasKCliente(List<InfoBancoUIA> list) 
	{
		 Iterator<InfoBancoUIA> cuentasIterator = list.iterator();
						 
		 int i=0;
		 int j=0;
		 
		 if(m_MapCuentas != null)
			 m_MapCuentas.clear();
		 else
			 m_MapCuentas = new HashMap<String, Producto>();
		 
		 String IdCuenta;
		 int numCuentas=0;
		 
		 // Enviar cuentas a Gestor de Cuentas 
		  while(cuentasIterator.hasNext())
		  {			
			  InfoBancoUIA cuentasTemp = cuentasIterator.next();
			  
			  List<InfoBancoUIA> misCuentas =  cuentasTemp.getItems();
			  Iterator<InfoBancoUIA> cuentaItemIterator = misCuentas.iterator();
			  
			  
			  numCuentas = misCuentas.size();
			  j=0;
			  
			  while(cuentaItemIterator.hasNext())
			  {
				  Producto itemCuenta =  (Producto) cuentaItemIterator.next();  
				  IdCuenta = itemCuenta.getId()+"_"+cuentasTemp.getName()+"_"+itemCuenta.getName(); 
				  m_MapCuentas.put(IdCuenta, itemCuenta);
		          System.out.println(IdCuenta+".  " +  itemCuenta.getName()+"\n");
		          j++;				  
			  }
			  
	       }
		  
	      numCuentas=numCuentas;
	}

	public MapCuentasKCliente() {
		m_MapCuentas = new HashMap<String, Producto>();
	}

	public HashMap<String, Producto> getM_MapCuentas() {
		return m_MapCuentas;
	}

	public void setM_MapCuentas(HashMap<String, Producto> m_MapCuentas) {
		this.m_MapCuentas = m_MapCuentas;
	}

	
	

}
