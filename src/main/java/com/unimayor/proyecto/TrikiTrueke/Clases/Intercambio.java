package com.unimayor.proyecto.TrikiTrueke.Clases;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "intercambios")
public class Intercambio {
    @Id
    private ObjectId id;
    private ObjectId articuloOfrecidoId;
    private ObjectId articuloSolicitadoId;
    private ObjectId usuarioOfreceId;
    private ObjectId usuarioRecibeId;
    private String estado; // pendiente, aceptado, rechazado, finalizado, cancelado
    private Date creadoEn;
    private String notas;

    public Intercambio() {}

    public Intercambio(ObjectId articuloOfrecidoId, ObjectId articuloSolicitadoId,
                       ObjectId usuarioOfreceId, ObjectId usuarioRecibeId, String estado) {
        this.articuloOfrecidoId = articuloOfrecidoId;
        this.articuloSolicitadoId = articuloSolicitadoId;
        this.usuarioOfreceId = usuarioOfreceId;
        this.usuarioRecibeId = usuarioRecibeId;
        this.estado = estado;
        this.creadoEn = new Date();
    }

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public ObjectId getArticuloOfrecidoId() { return articuloOfrecidoId; }
    public void setArticuloOfrecidoId(ObjectId articuloOfrecidoId) { this.articuloOfrecidoId = articuloOfrecidoId; }
    public ObjectId getArticuloSolicitadoId() { return articuloSolicitadoId; }
    public void setArticuloSolicitadoId(ObjectId articuloSolicitadoId) { this.articuloSolicitadoId = articuloSolicitadoId; }
    public ObjectId getUsuarioOfreceId() { return usuarioOfreceId; }
    public void setUsuarioOfreceId(ObjectId usuarioOfreceId) { this.usuarioOfreceId = usuarioOfreceId; }
    public ObjectId getUsuarioRecibeId() { return usuarioRecibeId; }
    public void setUsuarioRecibeId(ObjectId usuarioRecibeId) { this.usuarioRecibeId = usuarioRecibeId; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Date getCreadoEn() { return creadoEn; }
    public void setCreadoEn(Date creadoEn) { this.creadoEn = creadoEn; }
    public String getNotas() { return notas; }
    public void setNotas(String notas) { this.notas = notas; }

    @Override
    public String toString() {
        return "Intercambio{" +
                "id=" + id +
                ", articuloOfrecidoId=" + articuloOfrecidoId +
                ", articuloSolicitadoId=" + articuloSolicitadoId +
                ", usuarioOfreceId=" + usuarioOfreceId +
                ", usuarioRecibeId=" + usuarioRecibeId +
                ", estado='" + estado + '\'' +
                ", creadoEn=" + creadoEn +
                '}';
    }
}
