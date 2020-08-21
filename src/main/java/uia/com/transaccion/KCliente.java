package uia.com.transaccion;


import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KCliente extends InfoBancoUIA
{
	
		Double saldo = 0.0;
		private MapCuentasKCliente m_MapCuentas;
		
		@JsonCreator
	    public KCliente(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("saldo")double p1) 
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


		public MapCuentasKCliente getM_MapCuentas() {
			return m_MapCuentas;
		}

		public void setM_MapCuentas(MapCuentasKCliente m_MapCuentas) {
			this.m_MapCuentas = m_MapCuentas;
		}

		
	
		
}

