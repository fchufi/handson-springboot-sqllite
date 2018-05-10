/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handson.model;

import java.io.Serializable;
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
public class PlayListMusicas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String playlistId;
    private String musicaId;
    
    @OneToOne
    private Musica musica;
    
    @OneToOne
    private Usuario usuario;

    public PlayListMusicas() {
    }

    public PlayListMusicas(String playlistId, String musicaId, Musica musica, Usuario usuario) {
        this.playlistId = playlistId;
        this.musicaId = musicaId;
        this.musica = musica;
        this.usuario = usuario;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }

    public String getMusicaId() {
        return musicaId;
    }

    public void setMusicaId(String musicaId) {
        this.musicaId = musicaId;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
