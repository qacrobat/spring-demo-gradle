package de.qacrobat.springdemogradle.player.application;

import de.qacrobat.springdemogradle.player.domain.Player;

import java.util.List;

public interface PlayerService {

    Player createPlayer(String name, String lastname, boolean vip);

    List<Player> getAllPlayers();

    Player getPlayerById(Long id);
}
