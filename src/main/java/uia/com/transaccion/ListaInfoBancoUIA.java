package uia.com.transaccion;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public  class ListaInfoBancoUIA 
{
	protected int id;
	protected String name;
	
	 private List<InfoBancoUIA> items;

	    public ListaInfoBancoUIA(List<InfoBancoUIA> pl) {
	        this.items = pl;
	    }

	    public ListaInfoBancoUIA() {
	        this.items = new ArrayList<InfoBancoUIA>();
	    }

	    public List<InfoBancoUIA> getItems() {
	        return this.items;
	    }

	    public void setItems(List<InfoBancoUIA> l) {
	        this.items = l;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
}
