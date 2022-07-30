package IndianaJeans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ArchivoServicio {
	
	
	public ArrayList<Producto> cargarDatos(String ruta){
        
		ArrayList<Producto> lista = new ArrayList<Producto>();
       
		try {
			
            File archivo = new File(ruta);
            if (archivo.exists()) {
                FileReader fileReader = new FileReader(archivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea = bufferedReader.readLine(); //lectura del archivo completo
                while (linea != null) {
                 
                	//creamos un arreglo con cada item de la fila que esta separado por ","
                 
                	String[] arreglo = linea.split(",");
                	
                    Producto producto = new Producto(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4],
                            arreglo[5], arreglo[6]);
                    lista.add(producto);
                    linea = bufferedReader.readLine(); //pasar a la siguiente 
                    
                    bufferedReader.close();
                }
                System.out.println(lista.toString());
                
                System.out.println("Datos cargados correctamente en la lista\n");
            } else {
            	
                System.out.println("el archivo ingresado no existe");
            }
        } catch (Exception e) {
 
            e.printStackTrace();
        }
      
		return lista;
		
    }


	
}
