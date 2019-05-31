package de.qacrobat.springdemogradle.player;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PlayerServiceImpl implements PlayerService {

    private Map<String, PlayerRepository> repos;

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl (PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    @PostConstruct
    public void setUp(){
        this.playerRepository.saveOrUpdate(new Player("Stefan", "Z", 1L,false));

        playerRepository.findAll().stream().peek(s -> log.info(s.toString())).collect(Collectors.toList());
    }

    @Override
    public Player createPlayer(String name, String lastname, boolean vip){
        return null;
    }


}
