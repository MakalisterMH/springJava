package com.springjava.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjava.dslist.dto.GameMinDTO;
import com.springjava.dslist.entities.Game;
import com.springjava.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> gameMinDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameMinDTO;
    }


}
