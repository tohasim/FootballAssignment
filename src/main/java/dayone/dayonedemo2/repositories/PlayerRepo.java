package dayone.dayonedemo2.repositories;

import dayone.dayonedemo2.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo  extends JpaRepository<Player, Integer> {
}
