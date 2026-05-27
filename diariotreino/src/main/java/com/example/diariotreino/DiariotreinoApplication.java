package com.example.diariotreino;

import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DiariotreinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiariotreinoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		return args -> {

			if (usuarioRepository.findFirstByEmail("admin@diario.com").isEmpty()) {

				Usuario admin = new Usuario();
				admin.setNome("Administrador do Sistema");
				admin.setEmail("admin@diario.com");
				admin.setSenha(passwordEncoder.encode("123456"));
				admin.setPerfil("ADMIN");
				admin.setAtivo(true);
				admin.setPrimeiroAcesso(false);

				usuarioRepository.save(admin);
				System.out.println("Super Admin criado com sucesso!");

			} else {
				System.out.println("Super Admin já existe no banco de dados. Ignorando a criação.");
			}
		};
	}
}
