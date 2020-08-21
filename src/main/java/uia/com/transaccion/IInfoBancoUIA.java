package uia.com.transaccion;

public interface IInfoBancoUIA {
	
	public int  getIdCliente();
	public void setIdCliente();
	public void setSaldo();
	public Double  getSaldo();
	String  getProducto();
	public void setProducto();
	public int  getIdProducto();
	public void setIdProducto();
	public String  getTipo();
	public void setTipo();
	public String  getTransaccion();
	public void setTransaccion();
	public void realizaTransaccion();
	public int  getIdTransaccion();
	public void setIdTransaccion();
	public int  getId();
	public void setId();
	public int  getCuenta();
	public void setCuenta();
	public String  getFecha();
	public void setFecha();
}
