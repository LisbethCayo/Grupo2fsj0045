package IndianaJeans;

<<<<<<< HEAD
import java.util.List;

public class ProductoServicio  {
	
	

	List<Producto> listaProductos;

	public ProductoServicio(List<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	

	

	}

	

=======
import java.util.ArrayList;

public class ProductoServicio extends Producto {
	
//	************************************
//	ArrayList para contener los productos
//	*************************************
	ArrayList<String>listaProductos = new ArrayList<String>();

	
	
	
	
//	*********************************************
//	Getters que retorne la lista
//	*********************************************
	public ArrayList<String> getListaProductos() {
		return listaProductos;
	}

	
//	*********************************************
//	Setter  que modifica la lista
//	*********************************************
	public void setListaProductos(ArrayList<String> listaProductos) {
		this.listaProductos = listaProductos;
	}

//	*********************************************
//					Metdodos
//	*********************************************	
	
	public void listarProductos () {
		for(int i=0;i<listaProductos.size();i++) {
			System.out.println(getListaProductos().get(i));
		}
	}
	
	
	public void agregarProductos(String dato) {
		listaProductos.add(dato);
		
	}





}
>>>>>>> b6907917e2419d9841075067a873896a8376460d
