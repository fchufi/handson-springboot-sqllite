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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author hiro
 */
@Entity
public class PlayList implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @OneToMany
    private List<PlayListMusicas> playListMusicas;

    public PlayList() {
    }

    public PlayList(String id, List<PlayListMusicas> playListMusicas) {
        this.id = id;
        this.playListMusicas = playListMusicas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PlayListMusicas> getPlayListMusicas() {
        return playListMusicas;
    }

    public void setPlayListMusicas(List<PlayListMusicas> playListMusicas) {
        this.playListMusicas = playListMusicas;
    }
    
}
