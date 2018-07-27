package model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class CalificacionConceptual implements Calificacion {
	String notaConceptual;
	
	public CalificacionConceptual(String unaNotaConceptual)
	{
		notaConceptual = unaNotaConceptual;
	}
	public void setNotaConceptual(String nuevaNota) {
		notaConceptual = nuevaNota;
	}
	public String getNotaConceptual() {
		return notaConceptual;
	}
	public boolean aprobo()
	{
		return !notaConceptual.contains("M");
	}
	public double getNota()
	{
		if(notaConceptual.equals("B-"))
		{
			return 7;
		}
		else if(notaConceptual.equals("R+"))
		{
			return 6;
		}
		else
		{
			return 2;
		}
	}
}
