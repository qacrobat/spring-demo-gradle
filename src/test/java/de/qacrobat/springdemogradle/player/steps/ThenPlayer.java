package de.qacrobat.springdemogradle.player.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import de.qacrobat.springdemogradle.player.domain.Player;
import de.qacrobat.springdemogradle.player.domain.PlayerRepository;
import org.assertj.core.api.Assertions;

import static org.mockito.Mockito.verify;

public class ThenPlayer extends Stage<ThenPlayer> {

    @ScenarioState
    private PlayerRepository playerRepositoryMock;

    @ExpectedScenarioState
    private Player result;

    private static final String VORNAME = "Vorname";


    public ThenPlayer playerCreated(){
        Assertions.assertThat(result.getName()).isEqualTo(VORNAME);

        verify(playerRepositoryMock).save(result);

        return self();
    }
}
