package com.unimayor.proyecto.TrikiTrueke.InterfaceRepository;

import com.unimayor.proyecto.TrikiTrueke.Clases.Articulo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticuloRepository extends MongoRepository<Articulo, ObjectId> {
    List<Articulo> findByUsuarioId(ObjectId usuarioId);
    List<Articulo> findByCategoriaId(ObjectId categoriaId);
}
