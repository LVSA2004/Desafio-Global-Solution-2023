package br.com.fiap.gsjava.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.fiap.gsjava.models.Usuario;
import br.com.fiap.gsjava.repositories.UsuarioRepository;

import java.util.List;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    UsuarioRepository repo;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public void run(String... args) throws Exception {

        Usuario cl1 = Usuario.builder()
                .nome("Luan Sá")
                .telefone("(11) 95954-0882")
                .email("lvssfiap@gmail.com")
                .senha(encoder.encode("rm93057"))
                .build();
        Usuario cl2 = Usuario.builder()
                .nome("André Santi")
                .telefone("(11) 93897-8675")
                .email("santificado@gmail.com")
                .senha(encoder.encode("|(:oUuC<UZ"))
                .build();
        Usuario cl3 = Usuario.builder()
                .nome("Gabriel Henrique")
                .telefone("(19) 92483-9220")
                .email("ainzedamanga@gmail.com")
                .senha(encoder.encode("()faG(Ix40"))
                .build();
        Usuario cl4 = Usuario.builder()
                .nome("Henrique Alves")
                .telefone("(12) 92851-39012")
                .email("SORIYEEEE@gmail.com")
                .senha(encoder.encode(".kTU]l](|!n"))
                .build();

        repo.saveAll(List.of(
                cl1, cl2, cl3, cl4
        ));
    }
}
