package paquete;

public class Main {

	public static void main(String[] args) {
		Archivo entrada= new Archivo("conectar.in.txt");
		//entrada.escribeArchivo();
		System.out.println(entrada.leeArchivo());
	}

}
