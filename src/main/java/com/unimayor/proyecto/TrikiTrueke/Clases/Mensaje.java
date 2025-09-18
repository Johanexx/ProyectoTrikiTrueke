package com.unimayor.proyecto.TrikiTrueke.Clases;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "mensajes")
public class Mensaje {
    @Id
    private ObjectId id;
    private ObjectId intercambioId;
    private ObjectId remitenteId;
    private String texto;
    private boolean leido;
    private Date fecha;

    public Mensaje() {}

    public Mensaje(ObjectId intercambioId, ObjectId remitenteId, String texto) {
        this.intercambioId = intercambioId;
        this.remitenteId = remitenteId;
        this.texto = texto;
        this.leido = false;
        this.fecha = new Date();
    }

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public ObjectId getIntercambioId() { return intercambioId; }
    public void setIntercambioId(ObjectId intercambioId) { this.intercambioId = intercambioId; }
    public ObjectId getRemitenteId() { return remitenteId; }
    public void setRemitenteId(ObjectId remitenteId) { this.remitenteId = remitenteId; }
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
    public boolean isLeido() { return leido; }
    public void setLeido(boolean leido) { this.leido = leido; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    @Override
    public String toString() {
        return "Mensaje{" +
                "id=" + id +
                ", intercambioId=" + intercambioId +
                ", remitenteId=" + remitenteId +
                ", texto='" + texto + '\'' +
                ", leido=" + leido +
                ", fecha=" + fecha +
                '}';
    }
}
