package de.qacrobat.springdemogradle.player.application;

import de.qacrobat.springdemogradle.player.domain.Player;

import java.util.Set;

public interface PlayerService {

    Player createPlayer(String name, String lastname, boolean vip);

    Set<Player> getAllPlayers();

    Player getPlayerById(Long id);
}
