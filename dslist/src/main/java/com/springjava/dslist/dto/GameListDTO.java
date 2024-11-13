package com.springjava.dslist.dto;

import com.springjava.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String nome;

    public GameListDTO() {

    }

    public GameListDTO(GameList gameList) {
        this.id = gameList.getId();
        this.nome = gameList.getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
