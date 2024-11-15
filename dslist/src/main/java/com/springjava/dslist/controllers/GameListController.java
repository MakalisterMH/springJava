package com.springjava.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjava.dslist.dto.GameListDTO;
import com.springjava.dslist.dto.GameMinDTO;
import com.springjava.dslist.services.GameListService;
import com.springjava.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id){
    return gameListService.findById(id);
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

        @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId)  {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
