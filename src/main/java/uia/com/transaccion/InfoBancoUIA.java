package uia.com.transaccion;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME,
	    include = JsonTypeInfo.As.PROPERTY,
	    property = "type")
	@JsonSubTypes({
	    @Type(value = PreCliente.class, name = "precliente"),
	    @Type(value = KCliente.class, name = "cliente"),
	    @Type(value = Cuenta.class, name = "cuenta"),
	    @Type(value = Producto.class, name = "producto"),
	    @Type(value = Transaccion.class, name = "transaccion")
	    })

public abstract class InfoBancoUIA {

	private int id;
	private String name;
	private List<InfoBancoUIA> items;
	
	
	public InfoBancoUIA()
	{		
	}
	
	public InfoBancoUIA(int id, String name)
	{
		this.id=id;
		this.name = name;
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
	
	public List<InfoBancoUIA> getItems() {
		return items;
	}

	public void setItems(List<InfoBancoUIA> items) {
		this.items =  items;
	}
	
}
