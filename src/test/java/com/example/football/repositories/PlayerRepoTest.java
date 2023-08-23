package com.example.football.repositories;

import com.example.football.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PlayerRepoTest {
    @Autowired
    PlayerRepo playerRepo;
    boolean isInitialized = false;

    @BeforeEach
    void setUp() {
        if (!isInitialized){
            //Setup data
            playerRepo.save(new Player("Lionel Messi","C1","P1"));
            playerRepo.save(new Player("P2","C2","P2"));
            isInitialized = true;
        }
    }

    @Test
    public void deleteAll(){
        playerRepo.deleteAll();
        assertEquals(0, playerRepo.count());
    }

    @Test
    public void testAll(){
        Long count = playerRepo.count();
        assertEquals(2, count);
    }
    @Test
    void findByName() {
        Player p1 = playerRepo.findByName("P2");
        assertEquals("P2", p1.getName());
    }


    @Test
    void findByNameLike() {
        Player p1 = playerRepo.findByNameLike("%Messi%");
        assertEquals("Lionel Messi", p1.getName());
    }

}