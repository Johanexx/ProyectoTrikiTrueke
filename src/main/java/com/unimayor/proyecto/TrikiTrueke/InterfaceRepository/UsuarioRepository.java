package com.unimayor.proyecto.TrikiTrueke.InterfaceRepository;

import com.unimayor.proyecto.TrikiTrueke.Clases.Usuario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId> {
    Usuario findByEmail(String email);
}

