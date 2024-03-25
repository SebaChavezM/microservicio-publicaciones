package com.example.publicaciones;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PublicacionController {
    private List<Publicacion> publicaciones = new ArrayList<>();

    public PublicacionController() {
        // Inicializar la lista con datos
        Publicacion publicacion1 = new Publicacion(1, "Receta de lasaña de carne", "Aquí tienes una deliciosa receta para preparar una lasaña de carne casera.");
        publicacion1.addComentario(new Comentario(1, "¡Qué buena pinta! Definitivamente la voy a probar este fin de semana."));
        publicacion1.addComentario(new Comentario(2, "¡Gracias por compartir!"));
        publicacion1.addCalificacion(new Calificacion(1, 5));
        publicacion1.addCalificacion(new Calificacion(2, 4));
        publicaciones.add(publicacion1);        

        Publicacion publicacion2 = new Publicacion(2, "Receta de pastel de chocolate", "Aprende a preparar un delicioso pastel de chocolate con esta fácil receta.");
        publicacion2.addComentario(new Comentario(1, "¡Se ve increíble! Definitivamente lo probaré este fin de semana."));
        publicacion2.addComentario(new Comentario(2, "Gracias por compartir la receta."));
        publicacion2.addCalificacion(new Calificacion(1, 7));
        publicacion2.addCalificacion(new Calificacion(2, 7));
        publicaciones.add(publicacion2);

        Publicacion publicacion3 = new Publicacion(3, "Receta de ensalada de quinoa", "Descubre cómo preparar una deliciosa ensalada de quinoa llena de sabor y nutrientes.");
        publicacion3.addComentario(new Comentario(1, "¡Qué receta tan saludable! Definitivamente la probaré esta semana."));
        publicacion3.addComentario(new Comentario(2, "Me encantan las ensaladas de quinoa. Gracias por compartir."));
        publicacion3.addCalificacion(new Calificacion(1, 4));
        publicacion3.addCalificacion(new Calificacion(2, 5));
        publicaciones.add(publicacion3);
        
    }

    @GetMapping("/publicaciones")
    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    @GetMapping("/publicaciones/{id}")
    public Publicacion getPublicacionById(@PathVariable int id) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId() == id) {
                return publicacion;
            }
        }
        return null;
    }

    @GetMapping("/publicaciones/{id}/comentarios")
    public List<Comentario> getComentariosPublicacion(@PathVariable int id) {
        Publicacion publicacion = getPublicacionById(id);
        if (publicacion != null) {
            return publicacion.getComentarios();
        } else {
            // Manejar el caso donde la publicación no existe
            return null;
        }
    }

    @GetMapping("/publicaciones/{id}/calificaciones")
    public List<Calificacion> getCalificacionesPublicacion(@PathVariable int id) {
    Publicacion publicacion = getPublicacionById(id);
    if (publicacion != null) {
        return publicacion.getCalificaciones();
    } else {
        // Manejar el caso donde la publicación no existe
        return null;
    }
}
}
