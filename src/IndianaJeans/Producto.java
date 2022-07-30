package IndianaJeans;

<<<<<<< HEAD
public class Producto {
	//ATRIBUTOS
	
=======
import java.util.Scanner;

public class Producto  {

//	****************************************
//				VARIABLES
//	****************************************
>>>>>>> b6907917e2419d9841075067a873896a8376460d
	String articulo;
	String precio;
	String descripcion;
	String codigo;
	String talla;
	String marca;
	String color;
<<<<<<< HEAD
	
	
	//CONSTRUCTOR LLENO 
	
	public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca,
			String color) {
		super();
		this.articulo = articulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		this.color = color;
	}

	//CONSTRUCTOR VACIO
	public Producto() {
		super();
	}
	
	//GETTERS AND SETTERS
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//To String 
	
	@Override
	public String toString() {
		return "Producto [articulo=" + articulo + ", precio=" + precio + ", descripcion=" + descripcion + ", codigo="
				+ codigo + ", talla=" + talla + ", marca=" + marca + ", color=" + color + "]";
	}

	public void crearProductos(Object object, Object object2, Object object3, Object object4, Object object5,
			Object object6, Object object7) {
		// TODO Auto-generated method stub
		
	}

=======

//		**********************************
//					GETTERS
//		**********************************

	public String getArticulo() {
		return articulo;
	}

	public String getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTalla() {
		return talla;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

//		************************************
//					SETTERS
//		************************************

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

//		************************************
//				ToString
//		************************************

		@Override
		public String toString() {
			return "Producto [articulo=" + articulo + ", precio=" + precio + ", descripcion=" + descripcion
					+ ", codigo=" + codigo + ", talla=" + talla + ", marca=" + marca + ", color=" + color + "]";
		}
		
		
		
		public void crearProductos(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese nombre del producto: ");
			articulo = teclado.nextLine();
			setArticulo(articulo);
			System.out.println("Ingrese precio del producto: ");
			precio = teclado.nextLine();
			setPrecio(precio);
			System.out.println("Ingrese descripcion del producto: ");
			descripcion = teclado.nextLine();
			setDescripcion(descripcion);
			System.out.println("Ingrese codigo del producto: ");
			codigo = teclado.nextLine();
			setCodigo(codigo);
			System.out.println("Ingrese talla del producto: ");
			talla = teclado.nextLine();
			setTalla(talla);
			System.out.println("Ingrese marca del producto: ");
			marca = teclado.nextLine();
			setMarca(marca);
			System.out.println("Ingrese color del producto: ");
			color = teclado.nextLine();
			setColor(color);
			
		}
		
>>>>>>> b6907917e2419d9841075067a873896a8376460d
}
