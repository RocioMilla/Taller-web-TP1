package ar.edu.unlam.tallerweb1.servicios;
import org.springframework.stereotype.Service;

@Service("servicioCalcular")
public class ServicioCalcularImpl implements ServicioCalcular{
private Integer resultado;
	public Integer calcular(Integer numero1, String operador, Integer numero2) {
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
				resultado = numero1/numero2;
				break;
			default: 
				resultado=null;
				break;
		}
		return resultado;
	
	}

}
