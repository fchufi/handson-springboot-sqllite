/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handson.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author hiro
 */
@Entity
public class Musica implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nome;
    private String artistaId;
    
    @OneToOne
    private Artista artista;

    public Musica() {
    }

    public Musica(String id, String nome, String artistaId, Artista artista) {
        this.id = id;
        this.nome = nome;
        this.artistaId = artistaId;
        this.artista = artista;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(String artistaId) {
        this.artistaId = artistaId;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

}
