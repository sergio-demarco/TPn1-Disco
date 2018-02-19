package ar.edu.unlam.pb2.verano;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiscoTest {

	
	@Test
	public void testQueVerificaRadioInterior() {
		Disco miDisco = new Disco(10.0,30.0);
		Double actual = miDisco.getRadioInterior();
		Double esperado = 10.0;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void testQueVerificaRadioExterior(){
		Disco miDisco = new Disco(10.0,30.0);
		Double actual = miDisco.getRadioExterior();
		Double esperado = 30.0;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void testQueVerificaPerimetroInterior() {
		Disco miDisco = new Disco(10.0,30.0);
		Double actual = miDisco.getPerimetroInterior();
		Double esperado = 10.0*2*3.141592;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void testQueVerificaPerimetroExterior(){
		Disco miDisco = new Disco(10.0,30.0);
		Double actual = miDisco.getPerimetroExterior();
		Double esperado = 30.0*2*3.141592;
		assertEquals(esperado,actual);
	}
	@Test
	public void testQueVerificaSuperficieYSetters(){
		Disco miDisco = new Disco(10.0,30.0);
		miDisco.setRadioInterior(5.0);
		miDisco.setRadioExterior(20.0);
		Double valorRadioInterior = miDisco.getRadioInterior();
		Double valorRadioExterior = miDisco.getRadioExterior();
		Double radioTotalCalculado = valorRadioInterior + valorRadioExterior;
		Double actual = 3.141592 * radioTotalCalculado * radioTotalCalculado;
		Double esperado = miDisco.getSuperficie();
		assertEquals(esperado, actual);
	}
	
}