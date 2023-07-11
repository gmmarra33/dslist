package com.devsuperior.dslist.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.dslist.dto.gameminDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired //injetando componente 
    private GameRepository gameRepository;

    public List<gameminDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<gameminDTO> dto = result.stream().map(x -> new gameminDTO(x)).toList();
        return dto;
    }
}
