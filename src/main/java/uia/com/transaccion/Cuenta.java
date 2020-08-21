package uia.com.transaccion;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cuenta extends InfoBancoUIA
{
		String fecha = "";
		
		@JsonCreator
	    public Cuenta(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("fecha")String p1) 
		{
	        super(id, name);
	        this.fecha = p1;
	    }

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}	
		
		
	
}