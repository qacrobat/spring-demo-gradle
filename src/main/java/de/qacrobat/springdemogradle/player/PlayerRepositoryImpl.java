package de.qacrobat.springdemogradle.player;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Component
public class PlayerRepositoryImpl implements PlayerRepository {
    private Map<Long, Player> repository = new ConcurrentHashMap<>();

    @Override
    public void saveOrUpdate(Player player) {
        repository.put(player.getId(), player);
    }

    @Override
    public Set<Player> findAll() {
        return repository.values().stream().collect(Collectors.toSet());
    }

    @Override
    public void deletePlayer(Long id){

    }

    @Override
    public Optional<Player> findById(Long id){
        return null;
    }

}
