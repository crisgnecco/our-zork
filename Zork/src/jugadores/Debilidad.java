package jugadores;

import items.Item;

public class Debilidad {
	
	//protected String tipo;
	protected Item cosa;
	protected String derrotado;
	protected String accion;
	
	/*public Debilidad(String tipo, String cosa, String derrotado, String accion) {
		this.tipo = tipo;
		this.cosa = cosa;
		this.derrotado = derrotado;
		this.accion = accion;
	}*/
	public Debilidad(Item cosa, String derrotado, String accion) {// creo que puedo sacar la accion
		this.cosa = new Item(cosa.getNombre(), cosa.getGenero(),cosa.getNumero());
		this.derrotado = derrotado;
		this.accion = accion;
	}
	
	public Debilidad(Debilidad debilidad) {
		// TODO Auto-generated constructor stub
	}

	public boolean derrotado (Item objeto) {
		if(objeto.equals(cosa))
			return true;
		return false;
	}
	
	public String getDialogoDerrota() {
		return derrotado;
	}
	
	public String getAccion() {
		return accion;
	}

//	public String getTipo() {
//		return tipo;
//	}

	public Item getCosa() {
		return cosa;
	}
	
	
}
