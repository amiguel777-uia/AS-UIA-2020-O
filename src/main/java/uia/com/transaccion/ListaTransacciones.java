package uia.com.transaccion;

import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uia.com.transaccion.Transaccion;


public class ListaTransacciones 
{
	private String name ;
	private Date fechaactualizacion;
	private int size;
	
	
	public ArrayList<Transaccion> items;

	public ListaTransacciones()
	{		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getFechaactualizacion() {
		return fechaactualizacion;
	}
	public void setFechaactualizacion(Date fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}
	public ArrayList<Transaccion> getTransacciones() {
		return items;
	}
	public void setTransacciones(ArrayList<Transaccion> transacciones) {
		this.items = transacciones;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void agrega(Transaccion transaccionTemp) 
	{
		items.add(transaccionTemp);
	}
	public void salva() {
		// TODO Auto-generated method stub
		
	}
	
	
		
}

