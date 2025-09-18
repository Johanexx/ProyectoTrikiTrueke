package com.unimayor.proyecto.TrikiTrueke.InterfaceRepository;

import com.unimayor.proyecto.TrikiTrueke.Clases.Categoria;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, ObjectId> {
    Categoria findByNombre(String nombre);
}
