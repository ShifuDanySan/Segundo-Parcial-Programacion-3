package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Archivo {
	public Archivo(String direccion) {
		this.direccion = direccion;
	}

	public void escribeArchivo(char salida) {
		try (FileWriter archivo = new FileWriter(this.direccion, true)) {
			String texto = "";
			texto+=salida;
			texto += "\r\n";
			archivo.write(texto);
			archivo.close();
		} catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		}
	}

	public String leeArchivo() {
		this.cantidadLineasArchivo = 0;
		String texto = "";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(this.direccion));
			String temp = "";
			String bfRead;
			while ((bfRead = bf.readLine()) != null) {
				this.cantidadLineasArchivo++;
				temp += bfRead;
				temp += "\n";

			}
			bf.close();
		} catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		}
		return texto;
	}

	public int cantidadLineasArchivo() {
		return this.cantidadLineasArchivo;
	}
	
	
	public void guardaDatosDeArchivo() {

		try {
			BufferedReader bf = new BufferedReader(new FileReader(this.direccion));
			String linea = "";
			this.computadoras = new estadoComputadoras[this.cantidadLineasArchivo];
			int i = 0;
			while ((linea = bf.readLine()) != null) {
				computadoras[i] = new estadoComputadoras();
				computadoras[i].cargarDatosComputadora(linea);
				linea = "";
				i++;
			}
			bf.close();
		} catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		}
	}
	
	public estadoComputadoras[] devuelveEstadoComputadora(){
		return this.computadoras;
	}
	private String direccion = "";
	private int cantidadLineasArchivo = 0;
	private estadoComputadoras computadoras[];
}
