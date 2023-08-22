package com.example.Prijava.KorisnikService;

import com.example.Prijava.KorisnikDomain.Korisnik;
import com.example.Prijava.KorisnikRepository.KorisnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KorisnikService {

    @Autowired
    private KorisnikRepository repo;

    public KorisnikService(KorisnikRepository repo) {
        this.repo = repo;
    }

    public Korisnik login(String username, String password) {
        Korisnik user = repo.findByUsernameAndPassword(username, password);
        return user;
    }

}
