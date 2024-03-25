package com.example.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private int id;
    private String titulo;
    private String contenido;
    private List<Comentario> comentarios;
    private List<Calificacion> calificaciones;

    // Constructor
    public Publicacion(int id, String titulo, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.comentarios = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    // Método para agregar un comentario
    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    // Método para agregar una calificación
    public void addCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }
}
