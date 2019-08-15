package de.qacrobat.springdemogradle.player;


import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeScenario;
import com.tngtech.jgiven.junit.SimpleScenarioTest;
import de.qacrobat.springdemogradle.player.application.PlayerServiceImpl;
import de.qacrobat.springdemogradle.player.domain.Player;
import de.qacrobat.springdemogradle.player.domain.PlayerRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class PlayerServiceImplTest extends SimpleScenarioTest<PlayerServiceImplTest.Steps> {

    @Test
    public void shouldCreatePlayer() {
        given()
                .create_a_player();
        then()
                .a_player_created();

    }

    static class Steps extends Stage<Steps>{

        private static final String VORNAME = "Vorname";

        @Mock
        Player result;

        @Mock
        private PlayerRepository playerRepositoryMock;

        @InjectMocks
        private PlayerServiceImpl testee;

        @BeforeScenario
        public void setUp() {
            MockitoAnnotations.initMocks(this);
        }

        Steps create_a_player(){
            result = testee.createPlayer(VORNAME, "Nachname", false);

            return self();
        }

        Steps a_player_created(){
            Assertions.assertThat(result.getName()).isEqualTo(VORNAME);

            verify(playerRepositoryMock).save(result);

            return self();
        }



    }

}
