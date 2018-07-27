package model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Tarea {
	public String nombreTarea;
	public Tarea(String nombreTarea)
	{
		this.nombreTarea = nombreTarea;
	}

	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
}
