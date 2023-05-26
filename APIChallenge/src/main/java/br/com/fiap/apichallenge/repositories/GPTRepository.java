package br.com.fiap.apichallenge.repositories;

import br.com.fiap.apichallenge.models.ChatGPT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GPTRepository extends JpaRepository<ChatGPT, Long> {
}
