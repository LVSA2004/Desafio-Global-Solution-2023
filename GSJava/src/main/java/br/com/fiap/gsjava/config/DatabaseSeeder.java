package br.com.fiap.gsjava.config;

import br.com.fiap.gsjava.models.PessoaFisica;
import br.com.fiap.gsjava.models.Sexo;
import br.com.fiap.gsjava.models.Usuario;
import br.com.fiap.gsjava.repositories.UsuarioRepository;
import br.com.fiap.gsjava.repositories.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    UsuarioRepository repo;

    @Autowired
    PessoaRepository repository;

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

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setSexo(Sexo.FEMININO)
                .setCPF("515.730.748-96")
                .setNome("Luiza Ferreira")
                .setNascimento(LocalDate.now().minusYears(19));

        PessoaFisica pf2 = new PessoaFisica();
        pf1.setSexo(Sexo.MASCULINO)
                .setCPF("355.754.374-96")
                .setNome("Fernando de Sá")
                .setNascimento(LocalDate.now().minusYears(22));

        PessoaFisica pf3 = new PessoaFisica();
        pf1.setSexo(Sexo.FEMININO)
                .setCPF("168.384.445-93")
                .setNome("Thayna Isabelle")
                .setNascimento(LocalDate.now().minusYears(25));

        PessoaFisica pf4 = new PessoaFisica();
        pf1.setSexo(Sexo.MASCULINO)
                .setCPF("236.862.556-93")
                .setNome("Luiz Fernando")
                .setNascimento(LocalDate.now().minusYears(27));

        repository.saveAll(List.of(
                pf1, pf2, pf3, pf4
        ));
    }
}
