package ReciclaJeans;

import java.util.*;

public class ProductoServicios  {
	
	List<Producto> listaProductos;

	

	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	

	@Override
	public String toString() {
		return "ProductoServicios [listaProductos=" + listaProductos + "]";
	}
	
	public void listarProductos() {
		for(int i=0;i<listaProductos.size();i++) {
			System.out.println(getListaProductos().get(i));
		}
	}

	
	
	
	
	
}
