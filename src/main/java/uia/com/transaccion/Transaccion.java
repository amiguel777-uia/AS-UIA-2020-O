package uia.com.transaccion;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author amiguel
 * @version 1.0
 * @created 28-oct.-2019 05:09:07 p. m.
 */
public class Transaccion extends InfoBancoUIA {

	private String tipo;
	private int idtransaccion;
	private String fecharealizacion;
	private String fecharealizacionformat;
	private String nombre;
	private Double monto;
	private String receptor;

	

	/*
	public Transaccion(int idCuenta, Double monto2, Universidad miUniversidadTemp)
	{
		//setFechaInicio(new Date());
		//setFechaTransferencia(new Date());
		super.setId(idCuenta);
		setIdtransaccion(-1);
		setMonto(monto2);
		//setReceptor(miUniversidadTemp.getId());
		
		System.out.println("Estoy en transaccion, el monto del servicio es de:"+monto2);

	}

	public Transaccion(int idCuenta, float monto2, Universidad miUniversidadTemp) {
		super.setId(idCuenta);
		setIdtransaccion(-1);
		setMonto(monto);
		//setReceptor(miUniversidadTemp.getId());
		this.setNombre(miUniversidadTemp.getName());
		
		System.out.println("Estoy en transaccion, el monto del servicio es de:"+monto);
	}
	*/

	public Transaccion()
	{		
		super();
	}
	
	@JsonCreator
    public Transaccion(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("tipo")String p1, 
    				@JsonProperty("idtransaccion")int p2, @JsonProperty("fecharealizacion")String p3, @JsonProperty("nombre")String p4, @JsonProperty("monto")double p5, @JsonProperty("receptor")String p6) 	
	{
        super(id, name);
        this.tipo = p1;
    	idtransaccion = p2;
    	fecharealizacion = p3;
    	nombre = p4;
    	monto = p5;
    	receptor = p6;
    }



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getIdtransaccion() {
		return idtransaccion;
	}



	public void setIdtransaccion(int idtransaccion) {
		this.idtransaccion = idtransaccion;
	}



	public String getFecharealizacion() {
		return fecharealizacion;
	}



	public void setFecharealizacion(String fecharealizacion) {
		this.fecharealizacion = fecharealizacion;
	}



	public String getFecharealizacionformat() {
		return fecharealizacionformat;
	}



	public void setFecharealizacionformat(String fecharealizacionformat) {
		this.fecharealizacionformat = fecharealizacionformat;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Double getMonto() {
		return monto;
	}



	public void setMonto(Double monto) {
		this.monto = monto;
	}



	public String getReceptor() {
		return receptor;
	}



	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}	
	
	

}//end Transaccion