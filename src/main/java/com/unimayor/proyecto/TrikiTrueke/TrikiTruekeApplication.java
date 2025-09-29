package com.unimayor.proyecto.TrikiTrueke;

import com.unimayor.proyecto.TrikiTrueke.Clases.*;
import com.unimayor.proyecto.TrikiTrueke.InterfaceRepository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class TrikiTruekeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrikiTruekeApplication.class, args);
    }

    @Bean
    CommandLineRunner run(
            UsuarioRepository usuarioRepo,
            CategoriaRepository categoriaRepo,
            ArticuloRepository articuloRepo,
            IntercambioRepository intercambioRepo,
            MensajeRepository mensajeRepo
    ) {
        return args -> {

            // =====================
            // 🔹 Crear usuarios
            // =====================
            Usuario usuario1 = new Usuario("Goku de los Gokus", "kevin1@mail.com", "3002234567", "Calle de la Falsa 123");
            Usuario usuario2 = new Usuario("Laureles de monte ocoro", "laura1@mail.com", "3047654321", "Avenida la d Siempre Viva 742");
            usuarioRepo.saveAll(Arrays.asList(usuario1, usuario2));

            // =====================
            // 🔹 Crear categorías
            // =====================
            Categoria cat1 = new Categoria("Electrónicasw", "Dispositivos electrónicos");
            Categoria cat2 = new Categoria("Libros de koku", "Libros de todo tipo");
            categoriaRepo.saveAll(Arrays.asList(cat1, cat2));

            // =====================
            // 🔹 Crear artículos
            // =====================
            Articulo art1 = new Articulo("Smartphone PEPEGANGA", "Buen estado, usado", usuario1.getId(), cat1.getId(), "disponible");
            Articulo art2 = new Articulo("Libro de JavaMRD", "Nuevo, sin abrir", usuario2.getId(), cat2.getId(), "disponible");
            articuloRepo.saveAll(Arrays.asList(art1, art2));

            // =====================
            // 🔹 Crear intercambio
            // =====================
            Intercambio intercambio1 = new Intercambio(
                    art1.getId(),  // artículo ofrecido por Kevin
                    art2.getId(),  // artículo solicitado (de Laura)
                    usuario1.getId(), // Kevin ofrece
                    usuario2.getId(), // Laura recibe
                    "pendiente"
            );
            intercambioRepo.save(intercambio1);

            // =====================
            // 🔹 Crear mensajes
            // =====================
            Mensaje mensaje1 = new Mensaje(intercambio1.getId(), usuario1.getId(), "Hola Laura, te ofrezco mi celcho a cambio de tu libro.");
            Mensaje mensaje2 = new Mensaje(intercambio1.getId(), usuario2.getId(), "Hola Kevin goku, me interesa. ¿Podemos coordinar la entrega?");
            mensajeRepo.saveAll(Arrays.asList(mensaje1, mensaje2));

            // =====================
            // 🔹 Consultar y mostrar todo
            // =====================
            System.out.println("\n===== USUARIOS =====");
            usuarioRepo.findAll().forEach(System.out::println);

            System.out.println("\n===== CATEGORÍAS =====");
            categoriaRepo.findAll().forEach(System.out::println);

            System.out.println("\n===== ARTÍCULOS =====");
            articuloRepo.findAll().forEach(System.out::println);

            System.out.println("\n===== INTERCAMBIOS =====");
            intercambioRepo.findAll().forEach(System.out::println);

            System.out.println("\n===== MENSAJES =====");
            mensajeRepo.findAll().forEach(System.out::println);
        };
    }
}
