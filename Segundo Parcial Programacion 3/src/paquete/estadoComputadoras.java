package paquete;

public class estadoComputadoras {
	public estadoComputadoras(char avisoOConsulta, int k1, int k2) {// aviso de si es pregunta o aviso de que esta conectada
		this.avisoOConsulta = avisoOConsulta;
		this.k1 = k1;
		this.k2 = k2;
		if (this.avisoOConsulta == 'c') {
			this.k1Conectada = true;
			this.k1Conectada = true;
		}
	}

	public int devuelveavisoOConsulta() {
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
}
