package ar.edu.unlam.tallerweb1.controladores;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioCalcular;


@Controller
public class ControladorOperaciones {

@Inject 	
private ServicioCalcular servicioCalcular;

	@RequestMapping(path="calcular/{numero1}/{operador}/{numero2}")
	public ModelAndView hacerOperacion(@PathVariable Double numero1, @PathVariable String operador, @PathVariable Double numero2 ) {
		ModelMap modelo = new ModelMap();
		Double resultado = servicioCalcular.calcular(numero1,operador,numero2);
		modelo.put("resultado", resultado);
		if (resultado==null) {
			return new ModelAndView("error", modelo);
		}else {
		return new ModelAndView ("operacion", modelo);

		}
	}

}

