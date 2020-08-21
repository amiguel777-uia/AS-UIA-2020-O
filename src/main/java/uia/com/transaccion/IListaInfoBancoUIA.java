package uia.com.transaccion;

import java.util.ArrayList;

public interface IListaInfoBancoUIA {
	
	public String  getName();
	public void setName(String name);
	public void setId(int id);
	public int  getId();
	public InfoBancoUIA  getNodo();
	public void setNodo(InfoBancoUIA nodo);
	public ArrayList<InfoBancoUIA>  getItems();
	public ArrayList<InfoBancoUIA>  putItems(ArrayList<InfoBancoUIA> items);
	
}
