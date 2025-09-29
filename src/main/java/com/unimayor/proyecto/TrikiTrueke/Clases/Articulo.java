package com.unimayor.proyecto.TrikiTrueke.Clases;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "articulos")
public class Articulo {
    @Id
    private ObjectId id;
    private String titulo;
    private String descripcion;
    private ObjectId usuarioId;
    private ObjectId categoriaId;
    private List<String> fotos;
    private String estado; // disponible, reservado, intercambiado, retirado
    private Date creadoEn;

    public Articulo() {}

    public Articulo(String titulo, String descripcion, ObjectId usuarioId, ObjectId categoriaId, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.usuarioId = usuarioId;
        this.categoriaId = categoriaId;
        this.estado = estado;
        this.creadoEn = new Date();
    }

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public ObjectId getUsuarioId() { return usuarioId; }
    public void setUsuarioId(ObjectId usuarioId) { this.usuarioId = usuarioId; }
    public ObjectId getCategoriaId() { return categoriaId; }
    public void setCategoriaId(ObjectId categoriaId) { this.categoriaId = categoriaId; }
    public List<String> getFotos() { return fotos; }
    public void setFotos(List<String> fotos) { this.fotos = fotos; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Date getCreadoEn() { return creadoEn; }
    public void setCreadoEn(Date creadoEn) { this.creadoEn = creadoEn; }

    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", usuarioId=" + usuarioId +
                ", categoriaId=" + categoriaId +
                ", estado='" + estado + '\'' +
                ", creadoEn=" + creadoEn +
                '}';
    }
}
