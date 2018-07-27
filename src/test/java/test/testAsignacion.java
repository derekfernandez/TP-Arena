package test;

import model.*;
import org.junit.Before;
import org.junit.Test;
import ui.vm.EstudianteViewModel;

import static org.junit.Assert.assertEquals;

public class testAsignacion {

	Tarea primerParcialFisica;
	Estudiante ariel;
	Asignacion arielPrimerParcialFisica;
	EstudianteViewModel estView;
	
	@Before
	public void setUp()
	{
		estView = new EstudianteViewModel();
		ariel = new Estudiante("Ariel","Galvan","1589635","galvanariel97");
		primerParcialFisica = new Tarea("Primer parcial");
		arielPrimerParcialFisica = new Asignacion(primerParcialFisica);
		arielPrimerParcialFisica.agregarCalificacion(new CalificacionNumerica(8));
		ariel.agregarAsignacion(arielPrimerParcialFisica);
	}
	
	@Test
	public void testNotaActualCalifNumericas() 
	{
		arielPrimerParcialFisica.agregarCalificacion(new CalificacionNumerica(10));
		assertEquals(10, arielPrimerParcialFisica.notaActual(),0);
	}
	@Test
	public void testNotaActualCalifConceptual()
	{
		arielPrimerParcialFisica.agregarCalificacion(new CalificacionConceptual("M"));
		arielPrimerParcialFisica.agregarCalificacion(new CalificacionConceptual("B-"));
		assertEquals(7, arielPrimerParcialFisica.notaActual(),0);
	}
	@Test
	public void testAproboConCalifNumerica()
	{
		assertEquals(true, arielPrimerParcialFisica.aprobo());
	}
	@Test
	public void testAproboConCalifConceptual()
	{
		arielPrimerParcialFisica.agregarCalificacion(new CalificacionConceptual("M"));
		arielPrimerParcialFisica.agregarCalificacion(new CalificacionConceptual("B-"));
		assertEquals(true, arielPrimerParcialFisica.aprobo());
	}
	@Test
	public void testEstudianteViewConEstudiantesCantidad()
	{
		assertEquals(2,estView.getEstudiantes().size());
	}
	@Test
	public void testEstudianteViewConEstudiantesNombrePrimero()
	{
		//System.out.println(estView.getEstudiantes().get(1).getNombre());
		//System.out.println(estView.getEstudiantes().get(1).getApellido());
		assertEquals("Ariel",estView.getEstudiantes().get(0).getNombre());
	}

}
