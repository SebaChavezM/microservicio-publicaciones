package com.example.publicaciones;

public class Calificacion {
    private int id;
    private int valor;

    // Constructor
    public Calificacion(int id, int valor) {
        this.id = id;
        this.valor = valor;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
