package com.example.Prijava.KorisnikConfig;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Prijava.KorisnikDomain.Korisnik;
import com.example.Prijava.KorisnikRepository.KorisnikRepository;

@Configuration
public class KorisnikConfig {
    @Bean
    CommandLineRunner commandLineRunner(KorisnikRepository repository) {
        return args -> {
            Korisnik pera = new Korisnik(
                    "Pera Peric",
                    "pera",
                    "123");

            Korisnik ana = new Korisnik(
                    "Ana Ivanovic",
                    "ana",
                    "456");

            repository.saveAll(
                    List.of(pera, ana)
            );
        };
    }
}
