package uia.com.transaccion;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author amiguel
 * @version 1.0
 * @created 12-nov.-2019 11:27:37 a. m.
 */
public class PreCliente extends InfoBancoUIA
{
	private int tipo;
	private int estado;
	private String fecha;
			
			@JsonCreator
		    public PreCliente(@JsonProperty("id")int id, @JsonProperty("name")String name, 
		    		          @JsonProperty("tipo")int p1, @JsonProperty("estado")int p2, 
		    		          @JsonProperty("fecha")String p3) 
			{
		        super(id, name);
		        this.tipo = p1;
		        this.estado = p2;
		        this.fecha = p3;
		    }	

			public int getTipo() {
				return tipo;
			}

			public void setTipo(int tipo) {
				this.tipo = tipo;
			}

			public int getEstado() {
				return estado;
			}

			public void setEstado(int estado) {
				this.estado = estado;
			}

			public String getFecha() {
				return fecha;
			}

			public void setFecha(String fecha) {
				this.fecha = fecha;
			}

	
}
	