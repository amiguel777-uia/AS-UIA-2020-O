package uia.com.transaccion;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import uia.com.transaccion.Cuenta;

public class ListaCuentas extends ListaInfoBancoUIA
{
	private String fecha ;
	public KCliente m_KCliente;
	
	@JsonCreator
    public ListaCuentas(@JsonProperty("id")int p1, @JsonProperty("name")String p2, @JsonProperty("fecha")String p3) 
	{
        super.id = id;
        super.name=name;
        this.fecha = p3;
    }	
}

