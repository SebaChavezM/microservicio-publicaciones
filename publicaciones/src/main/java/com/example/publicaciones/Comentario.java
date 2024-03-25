package com.example.publicaciones;

public class Comentario {
    private int id;
    private String contenido;

    // Constructor
    public Comentario(int id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

