package model.repositorios;

import model.*;
import org.uqbar.commons.model.annotations.Observable;

import java.util.ArrayList;
import java.util.List;

@Observable
public class EstudianteRepository {


	public List<Estudiante> estudiantes = new ArrayList<>();

	public EstudianteRepository()
	{
		Estudiante ariel = new Estudiante("Ariel","Galvan","1589635","galvanariel97");
		Estudiante derek = new Estudiante("Derek","Fernandez", "1589027","derekfernandez");
		Estudiante julian = new Estudiante("Julian","Romero","1432801", "julianromero7");
		Tarea primerParcial = new Tarea("Primer parcial");
		Asignacion arielPrimerParcial = new Asignacion(primerParcial);
		Asignacion derekPrimerParcial = new Asignacion(primerParcial);
		Asignacion juliPrimerParcial = new Asignacion(primerParcial);
		arielPrimerParcial.agregarCalificacion(new CalificacionNumerica(2));
		derekPrimerParcial.agregarCalificacion(new CalificacionConceptual("B-"));
		juliPrimerParcial.agregarCalificacion(new CalificacionNumerica(4));
		ariel.agregarAsignacion(arielPrimerParcial);
		derek.agregarAsignacion(derekPrimerParcial);
		julian.agregarAsignacion(juliPrimerParcial);

		Tarea segundoParcial = new Tarea("Segundo parcial");
		Asignacion arielSegundoParcial = new Asignacion(segundoParcial);
		Asignacion derekSegundoParcial = new Asignacion(segundoParcial);
		Asignacion juliSegundoParcial = new Asignacion(segundoParcial);
		arielSegundoParcial.agregarCalificacion(new CalificacionNumerica(7));
		derekSegundoParcial.agregarCalificacion(new CalificacionConceptual("M"));
		juliSegundoParcial.agregarCalificacion(new CalificacionConceptual("M"));
		ariel.agregarAsignacion(arielSegundoParcial);
		derek.agregarAsignacion(derekSegundoParcial);
		julian.agregarAsignacion(juliSegundoParcial);

		this.agregarEstudiante(ariel);
		this.agregarEstudiante(derek);
		this.agregarEstudiante(julian);
	}
	
	public List<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}
	public void agregarEstudiante(Estudiante estudiante)
	{
		estudiantes.add(estudiante);
	}
	public void setEstudiantes(List<Estudiante> ests)
	{
		estudiantes = ests;
	}

}