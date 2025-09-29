package com.unimayor.proyecto.TrikiTrueke.InterfaceRepository;

import com.unimayor.proyecto.TrikiTrueke.Clases.Mensaje;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MensajeRepository extends MongoRepository<Mensaje, ObjectId> {
    List<Mensaje> findByIntercambioId(ObjectId intercambioId);
}
