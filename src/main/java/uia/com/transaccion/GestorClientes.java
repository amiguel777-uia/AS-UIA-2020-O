package uia.com.transaccion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;



/**
 * @author amiguel
 * @version 1.0
 * @created 12-nov.-2019 11:27:37 a. m.
 */
public class GestorClientes {

	private int opcion;
	private ListaKClientes miListaKClientes;
	private MapKClientes miMapKClientes;
	private MapCuentasKCliente m_MapCuentas;
	private KCliente m_Cliente;
	

	public GestorClientes() 
	{
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            //miListaKClientes = mapper.readValue(s, ListaKClientes.class);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
   		 	miListaKClientes = mapper.readValue(new FileInputStream("C:\\TSU-UIA\\bancoUIA\\src\\main\\java\\uia\\com\\transaccion\\listaClientes.json"), ListaKClientes.class );
            
        }
        catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (miListaKClientes != null) {
            System.out.println("----- Items List -----");

            for (InfoBancoUIA mi : miListaKClientes.getItems()) {
                System.out.println("Type = " + mi.getClass() +  ", id = "+ mi.getId() + ", name = " + mi.getName());
            }
        }
		
        miMapKClientes = new MapKClientes(miListaKClientes);
        m_MapCuentas = miMapKClientes.getM_MapCuentas();
	}

	public void finalize() throws Throwable {

	}
	
	public void actualiza(){

	}

	public MapCuentasKCliente getM_MapCuentas() {
		return m_MapCuentas;
	}

	public void setM_MapCuentas(MapCuentasKCliente m_MapCuentas) {
		this.m_MapCuentas = m_MapCuentas;
	}

	public KCliente buscaKCliente(int id)
	{
		/*  
		if(this.miMapClientes.getMapClientes().containsKey(id))
			return this.miMapClientes.getMapClientes().get(id);
		else
		*/		
			return null;
	}
		

	public Cuenta buscaKCuenta(int id, String tipo, String nombre)
	{
		String key = id+"_"+tipo+"_"+nombre;
		
		Cuenta cuentaTemp = null;
		
		/*
		if(this.miMapClientes.getMapClientes().containsKey(id))
		{
			if(this.miMapClientes.getMapClientes().get(id).getMiMapCuentas().getMiMapCuentas().containsKey(key))
			{
				cuentaTemp=this.miMapClientes.getMapClientes().get(id).getMiMapCuentas().getMiMapCuentas().get(key);
			}
		}
		*/

		if(cuentaTemp != null)
			return cuentaTemp;
		else		
			return null;
	}

	public void guarda() {
		
		/*
		ObjectMapper mapper = new ObjectMapper();
	      try
	      {
	         mapper.writeValue(new File("C:\\Java\\eclipse\\TransaccionUIA\\uia.com.transaccion\\uia\\com\\transaccion\\misClientesModificados.json"), miMapClientes );
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
	      */
		
	}
	
	
	public List<String> getLista() 
	{
		List<String> listaStr = new ArrayList<String>();
		
		HashMap<String, KCliente> miMap;
		miMap = miMapKClientes.getMapClientes();
		
		for (Entry<String, KCliente> entry : miMap.entrySet())
			 listaStr.add(entry.getValue().getName().toString());
			  return listaStr;		
	}

	
	public Map<String, String> getMapClientes() 
	{
		HashMap<String, String> mapStr = new HashMap<String, String>();
		
		HashMap<String, KCliente> miMap;
		miMap = miMapKClientes.getMapClientes();
		
		for (Entry<String, KCliente> entry : miMap.entrySet())
			 mapStr.put(entry.getValue().getName().toString(), entry.getValue().getName().toString());
	   return mapStr;		
	}

	public Map<String, String> getMapCuentas(String string) 
	{
		HashMap<String, String> mapStr = new HashMap<String, String>();
		
		
		m_Cliente = miMapKClientes.getM_MapClientes().get(string); 
		m_MapCuentas = m_Cliente.getM_MapCuentas();
		
		for (Entry<String, Producto> entry : m_MapCuentas.getM_MapCuentas().entrySet())
			 mapStr.put(entry.getValue().getName().toString(), entry.getValue().getName().toString());
	   return mapStr;
	}

	public List<String> getMapCuentasArray(String clienteStr)
	{
		List<String> listaStr = new ArrayList<String>();		
		if(clienteStr.isEmpty())
		{
			 listaStr.add("Sin selecci�n a�n");			
		}
		else
		{
			HashMap<String, Producto> miMap;
	
			m_Cliente = miMapKClientes.getM_MapClientes().get(clienteStr); 
			miMap = m_Cliente.getM_MapCuentas().getM_MapCuentas();
				   
			
			for (Entry<String, Producto> entry : miMap.entrySet())
				 listaStr.add(entry.getValue().getName().toString());
		}
		
		if (listaStr != null) 
		{
			for(int i = 0; i < listaStr.size(); i++) {
	            System.out.println(listaStr.get(i).toString());
	        }
            
        }
		
	    return listaStr;		
	   
	}

	
}//end KardexListaKClientes