package paquete;

public class Main {

	public static void main(String[] args) {
		Archivo entrada = new Archivo("conectar.in.txt");
		Archivo salida = new Archivo("conectar.out.txt");
		entrada.leeArchivo();
		entrada.guardaDatosDeArchivo();
		estadoComputadoras registrosDeEntrada[] = new estadoComputadoras[entrada.cantidadLineasArchivo()];
		registrosDeEntrada = entrada.devuelveEstadoComputadora();
		for (int i = 0; i < registrosDeEntrada.length; i++) {

			if (registrosDeEntrada[i].devuelveavisoOConsulta() == 'P' && i == 0) {
				salida.escribeArchivo('N');
			} else {
				if (registrosDeEntrada[i].devuelveavisoOConsulta() == 'P' && i!=0) {

					int k1Aux = registrosDeEntrada[i].devuelveK1();
					int k2Aux = registrosDeEntrada[i].devuelveK2();
					int j = 0;
					boolean esta=false;
					while (j < i) {
						if ((registrosDeEntrada[j].devuelveavisoOConsulta() == 'C')&& (registrosDeEntrada[j].devuelveK1() == k1Aux)&& (registrosDeEntrada[j].devuelveK2() == k2Aux)) {

							esta=true;

						}
						j++;
					}
					if(esta==false) {
						salida.escribeArchivo('N');
					}else {
						salida.escribeArchivo('S');
					}

				}

			}

		}

	}

}
