package uia.com.transaccion;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author amiguel
 * @version 1.0
 * @created 12-nov.-2019 11:27:37 a. m.
 */
public class Universidad {

	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}//end NodoListaCliente