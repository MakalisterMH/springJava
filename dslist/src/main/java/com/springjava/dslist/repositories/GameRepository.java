package com.springjava.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springjava.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
    
}
