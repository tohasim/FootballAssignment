package com.example.football.api;

import com.example.football.entity.Player;
import com.example.football.repositories.PlayerRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepo playerRepository;

    public PlayerController(PlayerRepo playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping
    List<Player> getPlayers() {
        return  playerRepository.findAll();
    }
}
