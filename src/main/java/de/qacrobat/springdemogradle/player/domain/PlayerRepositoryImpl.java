package de.qacrobat.springdemogradle.player;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Component
public class PlayerRepositoryImpl implements PlayerRepository {
    private static final AtomicLong ID_GENERATOR = new AtomicLong(1L);
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
        repository.remove(id);
    }

    @Override
    public Optional<Player> findById(Long id){
        return Optional.ofNullable(repository.get(id));
    }

    @Override
    public long getNextId() {
        return ID_GENERATOR.getAndIncrement();
    }

}
