package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.stereotype.Service;

@Service("servicioCalcular")
public interface ServicioCalcular {
	Integer calcular(Integer numero1, String operador, Integer numero2);
}
