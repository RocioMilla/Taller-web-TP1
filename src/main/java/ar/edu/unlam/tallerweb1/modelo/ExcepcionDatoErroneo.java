package ar.edu.unlam.tallerweb1.modelo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.CONFLICT, reason="El divisor no puede ser 0") //409
public class ExcepcionDatoErroneo extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3715489224430614428L;

	public ExcepcionDatoErroneo(String mensaje) {
		super(mensaje);
	}
	
}
