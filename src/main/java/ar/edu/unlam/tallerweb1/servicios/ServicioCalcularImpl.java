package ar.edu.unlam.tallerweb1.servicios;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.ExcepcionDatoErroneo;

@Service("servicioCalcular")
public class ServicioCalcularImpl implements ServicioCalcular{
private Double resultado;

	public Double calcular(Double numero1, String operador, Double numero2) throws Exception {
		switch (operador) {
			case "suma":
				resultado = numero1 + numero2;
				break;
			case "resta":
				resultado = numero1 - numero2;
				break;
			case "multiplicacion":
				resultado = numero1 * numero2;
				break;
			case "division":
				if (numero2==0) {
					throw new ExcepcionDatoErroneo();
				}
				else {
					resultado = numero1 / numero2;
				}
				break;
			default: 
				throw new ExcepcionDatoErroneo();
		}
		return resultado;
	
	}
	
}
