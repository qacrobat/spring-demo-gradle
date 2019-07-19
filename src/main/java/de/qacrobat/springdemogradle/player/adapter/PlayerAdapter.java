package de.qacrobat.springdemogradle.player.adapter;

import de.qacrobat.springdemogradle.player.application.PlayerService;
import de.qacrobat.springdemogradle.player.domain.Player;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Player.")
public class PlayerAdapter {

    private final PlayerService playerService;

    @GetMapping(path = "/players", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("Returns list of all Players in the system.")
    public Set<Player> players(){
        return playerService.getAllPlayers();
    }

    @GetMapping(path = "/players/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("Returns Player for the given id.")
    public Player players(@PathVariable Long id){
        return playerService.getPlayerById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/player", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("Creates Player.")
    public Player createPlayer(@ApiParam(name = "player", value = "Player to create", required = true) @RequestBody PlayerTo player) {
        return playerService.createPlayer(player.getName(), player.getLastname(), player.isVip());
    }


}
