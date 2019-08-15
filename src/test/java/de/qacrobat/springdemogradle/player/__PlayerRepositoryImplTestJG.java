package de.qacrobat.springdemogradle.player;


import com.tngtech.jgiven.junit.ScenarioTest;
import de.qacrobat.springdemogradle.player.domain.Player;
import de.qacrobat.springdemogradle.player.steps.GivenPlayer;
import de.qacrobat.springdemogradle.player.steps.ThenPlayer;
import de.qacrobat.springdemogradle.player.steps.WhenPlayer;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class __PlayerRepositoryImplTestJG extends ScenarioTest<GivenPlayer, WhenPlayer, ThenPlayer> {

    @Test
    public void shouldCreatePlayer() {
        // when
        when().createPlayer();

        // then
        then().playerCreated();
    }
}
