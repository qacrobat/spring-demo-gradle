package de.qacrobat.springdemogradle.player;

import java.util.Set;

public interface PlayerRepository {

    void save(Player player);

    Set<Player> findAll();

}
