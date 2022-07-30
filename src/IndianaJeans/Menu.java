package IndianaJeans;

import java.util.Scanner;

public class Menu {
	
		Scanner sc = new Scanner(System.in);
		ProductoServicio productoServicio = new ProductoServicio(); //listar productos
		ArchivoServicio archivoServicio = new ArchivoServicio(); //cargar datos
		

	public void iniciarMenu () {
		String op= "";
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1. Listar Producto");
			System.out.println("2. Editar producto");
			System.out.println("3. Exportar datos");
			System.out.println("4. Salir \n");
			System.out.println("Elija una opcion");
			op = sc.nextLine();
			
			
		
		}while(!op.equalsIgnoreCase("4"));
		
	}
	
	public void editarDatos() {
		if(productoServicio.getListaProductos().size() == 0) {
			System.out.println("Lista vacia");
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese codigo del producto: ");
			String codigo = sc.nextLine();
			
		for(Producto producto: productoServicio.getListaProductos()) {
			if(producto.getCodigo().equals(codigo)) {
				System.out.println("1. Nombre del articulo: " + producto.getArticulo());
				System.out.println("2. precio del articulo: "+ producto.getPrecio());
				System.out.println("3. descripcion: "+ producto.getDescripcion());
				System.out.println("4. codigo: " + producto.getCodigo());
				System.out.println("5. talla: " + producto.getTalla());
				System.out.println("6. marca: " + producto.getMarca());
				System.out.println("7. color: " + producto.getColor());
				
			}
			
		}
		
		}
	}
	
	public void opcionProductos(int opcion, Producto producto) {
		
	}

	public static void menu() {
		// TODO Auto-generated method stub
		
	}
}