package com.example.Prijava.KorisnikDomain;

import jakarta.persistence.*;

@Entity
@Table(name = "korisnici")

public class Korisnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime_prezime;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme_prezime() {
        return ime_prezime;
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime = ime_prezime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Korisnik(String ime_prezime, String username, String password) {
        super();
        this.ime_prezime = ime_prezime;
        this.username = username;
        this.password = password;
    }

    public Korisnik() {

    }

    public Korisnik(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Korisnik [id=" + id + ", ime_prezime=" + ime_prezime + ", username=" + username + ", password="
                + password + "]";
    }
}



