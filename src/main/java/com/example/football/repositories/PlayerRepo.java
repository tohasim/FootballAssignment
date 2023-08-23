package com.example.football.repositories;

import com.example.football.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo  extends JpaRepository<Player, Integer> {
}
