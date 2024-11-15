package com.springjava.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springjava.dslist.dto.GameDTO;
import com.springjava.dslist.dto.GameMinDTO;
import com.springjava.dslist.entities.Game;
import com.springjava.dslist.projections.GameMinProjection;
import com.springjava.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO gameDTO = new GameDTO(result);
        return gameDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> gameMinDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameMinDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }


}
