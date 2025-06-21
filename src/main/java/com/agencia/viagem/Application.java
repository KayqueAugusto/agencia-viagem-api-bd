package com.agencia.viagem;

import com.agencia.viagem.model.Usuario;
import com.agencia.viagem.model.Role;
import com.agencia.viagem.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Bean
    // CommandLineRunner init(UsuarioRepository usuarioRepository) {
    //     return args -> {
    //         if (usuarioRepository.findByLogin("admin").isEmpty()) {
    //             Usuario usuario = new Usuario();
    //             usuario.setLogin("admin");
    //             usuario.setSenha(new BCryptPasswordEncoder().encode("123456"));
    //             usuario.setRole(Role.ROLE_ADMIN);
    //             usuarioRepository.save(usuario);
    //             System.out.println("✅ Usuário admin criado com sucesso!");
    //         }
    //     };
    // }
}
