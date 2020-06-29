package paquete;

public class estadoComputadoras {
	public estadoComputadoras() {// aviso de si es pregunta o aviso de que esta
																	// conectada
		this.avisoOConsulta = avisoOConsulta;
		this.k1 = k1;
		this.k2 = k2;

	}

	public void cargarDatosComputadora(String lin) {
		linea = lin;
		aux = "";
		if (linea.equalsIgnoreCase("F") == false) {
			for (int i = 0; i < this.linea.length(); i++) {
				if (linea.charAt(i) != ' ') {
					aux += linea.charAt(i);
				} else {
					contadorEspacios++;

					if (contadorEspacios == 1) {
						this.avisoOConsulta = linea.charAt(0);
						aux = "";
					}

					if (contadorEspacios == 2) {
						this.k1 = Integer.parseInt(aux);
						aux = "";
					}
				}
				if (i == linea.length() - 1) {
					this.k2 = Integer.parseInt(aux);
					aux = "";
				}
			}
			this.linea = "";
			contadorEspacios = 0;
			this.linea = "";
			aux = "";

			if (this.avisoOConsulta == 'c') {
				this.k1Conectada = true;
				this.k2Conectada = true;
			}
		}
	}

	public char devuelveavisoOConsulta() {
		return this.avisoOConsulta;
	}

	public int devuelveK1() {
		return this.k1;
	}

	public int devuelveK2() {
		return this.k2;
	}

	private char avisoOConsulta;
	private int k1 = 0;
	private int k2 = 0;
	private boolean k1Conectada = false;
	private boolean k2Conectada = false;
	private String linea = "";
	private String aux = "";
	private int contadorEspacios = 0;
}
