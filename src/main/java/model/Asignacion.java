package model;

import org.uqbar.commons.model.annotations.Observable;

import java.util.ArrayList;
import java.util.List;

@Observable
public class Asignacion {
	public Tarea tarea;
	public List<Calificacion> calificaciones = new ArrayList<>();
	
	public Asignacion(Tarea unaTarea)
	{
		tarea = unaTarea;
	}
	public void setTarea(Tarea unaTarea)
	{
		this.tarea = unaTarea;
	}
	public Tarea getTarea()
	{
		return tarea;
	}
	public void setCalificaciones(List<Calificacion> califs)
	{
		calificaciones = califs;
	}
	public List<Calificacion> getCalificaciones()
	{
		return calificaciones;
	}
	public boolean aprobo()
	{
		return this.califActual().aprobo();
	}
	public Calificacion califActual()
	{
		return calificaciones.get(calificaciones.size() - 1);
	}
	public double notaActual()
	{
		return this.califActual().getNota();
	}
	public void agregarCalificacion(Calificacion calif)
	{
		calificaciones.add(calif);
	}

	@Override
	public String toString()
	{
		return tarea.getNombreTarea();
	}


}
