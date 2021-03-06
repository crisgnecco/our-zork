package items;

import java.util.HashMap;

public class Inventario {
	
	protected String nombre;
	protected HashMap<String, Item> inventory;
	protected String descripcion;
	protected String[] aceptar;
	
	
	public Inventario() {
		
		inventory = new HashMap<String, Item>();
		
	}
	
//// GETTERS ////	
	public HashMap<String, Item> getInventory(){
		
		return this.inventory;
		
	}
	public String listarItems() { 
		int i=0;
		String cadena = "En tu inventario hay: ";
		for(Item item : inventory.values()) {
			if(inventory.values().size() == 1) {
				cadena += item.toString();
			}else if(i+1 == inventory.values().size()) {
				cadena += "y " + item.toString();
			}else {
				cadena += item.toString() + ", ";
			}
			i++;
		}
		cadena +=".";
		return cadena;
		
	}
	public Item getItem(String objeto) { /* remueve el item del inentario*/
		Item aux = null;
		for(Item item : inventory.values()) {
			if(item.getNombre().equals(objeto)) {
				aux = new Item(item.getNombre(), item.getGenero(), item.getNumero());
				inventory.remove(objeto);
				break;
			}
		}
		return aux;
	}
//// AGREGAR ELEMENTO ////	
	public void agregarItem(Item obj) {
		inventory.put(obj.getNombre(), obj);
		
	}
	
		
}