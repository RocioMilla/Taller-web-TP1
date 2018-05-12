package ar.edu.unlam.tallerweb1.helper;

import ar.edu.unlam.tallerweb1.modelo.ExcepcionDatoErroneo;

public class HelperExcepcionDatoErroneo {
	public HelperExcepcionDatoErroneo() {
		
	}
	
	public void validarDivision(Double numero2) throws ExcepcionDatoErroneo{
		if(numero2==0) {
			throw new ExcepcionDatoErroneo("El divisor no puede ser 0");
		}
	}
	
	public void validarOperador(String operador) throws ExcepcionDatoErroneo{
		if(!operador.equals("suma")&&!operador.equals("resta")&&!operador.equals("multiplicacion")&&!operador.equals("division")) {
			throw new ExcepcionDatoErroneo("Asegúrese de usar \"suma\", \"resta\", \"multiplicacion\" o \"division\".");
		}
	}
}
