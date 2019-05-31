package de.qacrobat.springdemogradle.player;

import java.util.Set;

public interface PlayerRepository {

    void saveOrUpdate(Player player);

    Set<Player> findAll();

    Player findById(Long id);

    void deletePlayer(Long id);

}
