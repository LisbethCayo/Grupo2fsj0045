package ReciclaJeans;

public class Producto {
	
	
	String articulo;
	String precio;
	String descripcion;
	String codigo;
	String talla;
	String marca;
	String color;
	
	
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


	public Producto() {
		super();
	}




	
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


	
	
	@Override
	public String toString() {
		return "Producto [articulo=" + articulo + ", precio=" + precio + ", descripcion=" + descripcion + ", codigo="
				+ codigo + ", talla=" + talla + ", marca=" + marca + ", color=" + color + "]";
	}


	public void substring(String dato) {
		setArticulo(dato);
		
	}


	
	
	
	


}
