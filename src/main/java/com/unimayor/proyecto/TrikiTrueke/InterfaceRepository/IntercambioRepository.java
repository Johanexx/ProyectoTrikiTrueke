package com.unimayor.proyecto.TrikiTrueke.InterfaceRepository;

import com.unimayor.proyecto.TrikiTrueke.Clases.Intercambio;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IntercambioRepository extends MongoRepository<Intercambio, ObjectId> {
    List<Intercambio> findByUsuarioOfreceId(ObjectId usuarioOfreceId);
    List<Intercambio> findByUsuarioRecibeId(ObjectId usuarioRecibeId);
}

