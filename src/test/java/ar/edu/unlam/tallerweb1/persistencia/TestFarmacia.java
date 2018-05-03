package ar.edu.unlam.tallerweb1.persistencia;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Barrio;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Farmacia;
import ar.edu.unlam.tallerweb1.modelo.Punto;

public class TestFarmacia extends SpringTest {

	@Test
	@Transactional @Rollback(true)
	public void buscarFarmaciasDeTurnoMartes() {
		Punto geoLocalizacion1 = new Punto("1","1");
		getSession().save(geoLocalizacion1);
		Barrio barrio1 = new Barrio("Moron");
		getSession().save(barrio1);
		Direccion direccion1 = new Direccion("Calle falsa","123",barrio1);
		getSession().save(direccion1);
		Farmacia farmacia1 = new Farmacia("Farmacia1","11111","Martes",direccion1,geoLocalizacion1);
		getSession().save(farmacia1);
		
		List<Farmacia> Resultado = getSession().createCriteria(Farmacia.class)
				.add(Restrictions.eq("diaDeTurno", "Martes")).list();
		assertThat(Resultado).hasSize(1);

		}
	
	@Test
	@Transactional @Rollback(true)
	public void buscarFarmaciasPorCalle() {
		Punto geoLocalizacion1 = new Punto("1","1");
		getSession().save(geoLocalizacion1);
		Barrio barrio1 = new Barrio("Moron");
		getSession().save(barrio1);
		Direccion direccion1 = new Direccion("Calle falsa","123",barrio1);
		getSession().save(direccion1);
		Farmacia farmacia1 = new Farmacia("Farmacia1","11111","Martes",direccion1,geoLocalizacion1);
		getSession().save(farmacia1);
		
		List<Farmacia> Resultado = getSession().createCriteria(Farmacia.class)
			.createAlias("direccion", "direccionBuscada")
			.add(Restrictions.eq("direccionBuscada.calle", "Calle falsa")).list();
			assertThat(Resultado).hasSize(1);

		}
	
	
}
