package ReciclaJeans;

import java.io.*;
import java.util.*;



public class ArchivoServicio {

	
	Producto producto;
	
	
	public void cargarDatos(List<Producto>lista2) throws IOException {	
		Scanner teclado = new Scanner(System.in);
		final String separador="\\,";
		String nombreArchivo = null;
		System.out.println("Ingrese nombre del archivo");
		nombreArchivo = teclado.nextLine();
		
		BufferedReader cargar = new BufferedReader(new FileReader("src/ReciclaJeans/files/"+nombreArchivo+".csv"));
		System.out.println("Archivo Cargado");
		String line = cargar.readLine();
		
		while(line!=null) {
		
			
			//Creamos una lista que contenga los elementos
			String[] lista = line.split(separador);
								//Aplicamos el metodos split para separar los elementos
			Producto pro = new Producto(lista[0],lista[1],lista[2],lista[3],lista[4],lista[5],lista[6]);
			System.out.println(pro.toString());
			lista2.add(pro);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//						//Recorremos la lista con la variable elemento
//			for (String elemento : lista) {
//				
////				System.out.println(elemento.length());
//				String captura = elemento;
//				captura.substring(elemento.length());
//				System.out.println(captura);
//				for (int i = 0; i<lista.length ;i++) {
//					String[] articulo = lista;
//////					System.out.println(captura);
//					for (int j = 0; j < ;j++) {
//					articulo[j] = elemento;
//					System.out.println(elemento);
//					
//					System.out.println("Articulo agregado");
//					System.out.println(articulo[0]);
//					System.out.println("*************");
//					
//					}
//////				
//				}
//			}
			
	
		
		line = cargar.readLine();
		
		}
		
	   
	}

}