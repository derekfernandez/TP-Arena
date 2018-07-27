package model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class CalificacionNumerica implements Calificacion {
	double nota;
	
	public CalificacionNumerica(double unaNota)
	{
		nota = unaNota;
	}
	public void setNota(int nuevaNota) {
		nota = nuevaNota;
	}
	public double getNota() {
		return nota;
	}
	public boolean aprobo()
	{
		return nota >= 6;
	}
}
