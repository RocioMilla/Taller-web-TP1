package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.stereotype.Service;

@Service("servicioCalcular")
public interface ServicioCalcular {
	Double calcular(Double numero1, String operador, Double numero2);
}
