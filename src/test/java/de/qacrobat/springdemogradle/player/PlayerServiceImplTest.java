package de.qacrobat.springdemogradle.player;


import de.qacrobat.springdemogradle.player.Player;
import de.qacrobat.springdemogradle.player.PlayerRepository;
import de.qacrobat.springdemogradle.player.PlayerServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class PlayerServiceImplTest {

    private static final String VORNAME = "Vorname";
    @Mock
    private PlayerRepository playerRepositoryMock;

    @InjectMocks
    private PlayerServiceImpl testee;

    @Before
    public void setUp() {
        // Alternative zu MockitoRunner
        // MockitoAnnotations.initMocks(this.getClass());
    }

    @Test
    public void shouldCreatePlayer() {
        // when
        final Player result = testee.createPlayer(VORNAME, "Nachname", false);

        // then
        Assertions.assertThat(result.getName()).isEqualTo(VORNAME);

        verify(playerRepositoryMock).saveOrUpdate(result);
        verify(playerRepositoryMock).getNextId();
        verifyNoMoreInteractions(playerRepositoryMock);

    }

}
