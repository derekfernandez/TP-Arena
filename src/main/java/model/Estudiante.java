package model;

import org.uqbar.commons.model.annotations.Observable;

import java.util.ArrayList;
import java.util.List;

@Observable
public class Estudiante {
    public String nombre;
    public String apellido;
    public String legajo;
    public String usuarioGitHub;

    public List<Asignacion> asignaciones;

    public Estudiante(String unNombre, String unApellido, String unLegajo, String unGit) {
        nombre = unNombre;
        apellido = unApellido;
        legajo = unLegajo;
        usuarioGitHub = unGit;
        asignaciones = new ArrayList<>();
    }

    @Override
    public String toString()
    {
        return this.getNombre() + " " + this.getApellido();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String unApellido) {
        apellido = unApellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String unLegajo) {
        legajo = unLegajo;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public void agregarAsignacion(Asignacion asig) {
        asignaciones.add(asig);
    }

    public String getUsuarioGitHub() {
        return usuarioGitHub;
    }

    public void setUsuarioGitHub(String usuarioGitHub) {
        this.usuarioGitHub = usuarioGitHub;
    }

}
