package IndianaJeans;

import java.io.IOException;

public class Utilidad {

	public static void main (String []args) throws IOException, InterruptedException {


			new ProcessBuilder("cleaner").inheritIO().start().waitFor();
			

	}
}


