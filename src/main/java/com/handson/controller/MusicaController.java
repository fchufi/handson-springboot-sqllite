/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handson.controller;

import com.handson.model.Musica;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hiro
 */
@RestController
public class MusicaController {
    
    @RequestMapping("/api/musicas")
    public Musica buscaMusica(@RequestParam(value="filtro", defaultValue = "") String filtro) {
        return null;
    }
}
