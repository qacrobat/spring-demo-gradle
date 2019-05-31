package de.qacrobat.springdemogradle.player;

import java.util.Optional;
import java.util.Set;

public interface PlayerRepository {

    void saveOrUpdate(Player player);

    Set<Player> findAll();

    Optional<Player> findById(Long id);

    void deletePlayer(Long id);

}
