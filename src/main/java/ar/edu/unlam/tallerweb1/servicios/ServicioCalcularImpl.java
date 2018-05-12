package ar.edu.unlam.tallerweb1.servicios;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.helper.HelperExcepcionDatoErroneo;
import ar.edu.unlam.tallerweb1.modelo.ExcepcionDatoErroneo;

@Service("servicioCalcular")
public class ServicioCalcularImpl implements ServicioCalcular{
private Double resultado;
HelperExcepcionDatoErroneo h = new HelperExcepcionDatoErroneo();

	public Double calcular(Double numero1, String operador, Double numero2) throws Exception {
	try {	h.validarOperador(operador);
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
		try {
			h.validarDivision(numero2);
			resultado = numero1 / numero2;
		}
		catch(ExcepcionDatoErroneo e)
		{
			String mensaje = e.getMessage();
			throw new ExcepcionDatoErroneo(mensaje);
		}
		break;
}
		return resultado;
	}
	catch(ExcepcionDatoErroneo e) {
		String mensaje = e.getMessage();
		throw new ExcepcionDatoErroneo(mensaje);
	}
}
}
