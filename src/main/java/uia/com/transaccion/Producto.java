package uia.com.transaccion;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Producto extends InfoBancoUIA
{
	
		Double saldo = 0.0;
		
		@JsonCreator
	    public Producto(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("saldo")Double p1) 
		{
	        super(id, name);
	        this.saldo = p1;
	    }

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}	
	
		
}