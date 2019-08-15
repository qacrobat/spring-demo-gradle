package de.qacrobat.springdemogradle.player.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import de.qacrobat.springdemogradle.player.application.PlayerServiceImpl;
import de.qacrobat.springdemogradle.player.domain.Player;
import de.qacrobat.springdemogradle.player.domain.PlayerRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class WhenPlayer extends Stage<WhenPlayer> {

    @ScenarioState
    private PlayerRepository playerRepositoryMock;

    @ScenarioState
    private PlayerServiceImpl testee;

    @ProvidedScenarioState
    Player result;

    private static final String VORNAME = "Vorname";


    public WhenPlayer createPlayer(){
        result = testee.createPlayer(VORNAME, "Nachname", false);

        return self();
    }
}
