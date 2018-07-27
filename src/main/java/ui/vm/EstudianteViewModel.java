package ui.vm;

import model.Asignacion;
import model.Estudiante;
import model.repositorios.Repositorios;
import org.uqbar.commons.model.annotations.Observable;

import java.util.List;

@Observable
public class EstudianteViewModel {
	public List<Estudiante> estudiantes;
	public Estudiante estudianteSeleccionado;
	public Asignacion asignacionSeleccionado;
	
	public EstudianteViewModel()
	{
		estudiantes = Repositorios.estudiantes.getEstudiantes();
	}

	public Estudiante getEstudianteSeleccionado() {
		return estudianteSeleccionado;
	}

	public void setEstudianteSeleccionado(Estudiante estudianteSeleccionado) {
		this.estudianteSeleccionado = estudianteSeleccionado;
	}

	public List<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}

	public Asignacion getAsignacionSeleccionado() {
		return asignacionSeleccionado;
	}

	public void setAsignacionSeleccionado(Asignacion asignacionSeleccionado) {
		this.asignacionSeleccionado = asignacionSeleccionado;
	}
	public double getNotaActual()
	{
		return this.asignacionSeleccionado.notaActual();
	}
	public boolean aprobo()
	{
		return this.asignacionSeleccionado.aprobo();
	}
}
