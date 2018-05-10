/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handson.repository;

import com.handson.model.PlayList;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hiro
 */
public abstract class PlayListRepository implements CrudRepository<PlayList, String>{
    
}
