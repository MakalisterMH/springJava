package com.springjava.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.springjava.dslist.dto.GameListDTO;
import com.springjava.dslist.entities.GameList;
import com.springjava.dslist.repositories.GameListReposity;


@Service
public class GameListService {
    
    @Autowired
    private GameListReposity gameListReposity;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListReposity.findAll();
        List<GameListDTO> gameListDTO = result.stream().map(x -> new GameListDTO(x)).toList();
        return gameListDTO;
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id){
        GameList result = gameListReposity.findById(id).get();
        GameListDTO gameListDTO = new GameListDTO(result);
        return gameListDTO;
    }


}
