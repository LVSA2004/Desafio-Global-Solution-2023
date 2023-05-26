package br.com.fiap.apichallenge.service;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import br.com.fiap.apichallenge.models.Credencial;
import br.com.fiap.apichallenge.models.TokenJwt;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
@Service
public class TokenService {
    public TokenJwt generateToken(Credencial credencial) {
        Algorithm alg = Algorithm.HMAC256("secret");
        String token = JWT.create()
                .withSubject(credencial.email())
                .withIssuer("GS")
                .withExpiresAt(Instant.now().plus(2, ChronoUnit.HOURS))
                .sign(alg);
        return new TokenJwt(token);
    }

    public String valide(String token) {
        Algorithm alg = Algorithm.HMAC256("secret");
        return JWT.require(alg)
                .withIssuer("GS")
                .build()
                .verify(token)
                .getSubject();
    }
}
