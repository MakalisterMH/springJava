package com.springjava.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.dslist.entities.GameList;

public interface GameListReposity extends JpaRepository <GameList , Long> {

}
