package com.example.Prijava.KorisnikRepository;

import com.example.Prijava.KorisnikDomain.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
    Korisnik findByUsernameAndPassword(String username, String password);
}
