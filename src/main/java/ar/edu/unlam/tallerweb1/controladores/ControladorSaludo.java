package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorSaludo {
	@RequestMapping (path="/saludar")
	public ModelAndView saludar() {
		ModelMap modelo1 = new ModelMap();
		modelo1.put("nombre", "Pepito");
		return new ModelAndView ("saludo", modelo1);
	}
	
	@RequestMapping ("despedir/{nombre}/{apellido}")
	public ModelAndView despedir(@PathVariable String nombre, @PathVariable String apellido) {
		ModelMap modelo2 = new ModelMap();
		modelo2.put("nombre", nombre);
		modelo2.put("apellido", apellido);
		return new ModelAndView ("despedida", modelo2);
	}
}