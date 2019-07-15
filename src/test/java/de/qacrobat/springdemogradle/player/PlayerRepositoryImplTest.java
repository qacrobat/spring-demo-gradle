package de.qacrobat.springdemogradle.player;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class PlayerRepositoryImplTest {

    protected static final long PLAYER_ID = 17L;

    private PlayerRepositoryImpl testee;
    private Player playerMock;

    @Before
    public void setUp() {
        // given
        testee = new PlayerRepositoryImpl();
        playerMock = mock(Player.class);
        when(playerMock.getId()).thenReturn(PLAYER_ID);
    }

    @Test
    public void shouldSaveNewSchuldner() {
        // when
        testee.saveOrUpdate(playerMock);

        // then
        assertThat(testee.findById(PLAYER_ID).get()).isEqualTo(playerMock);
    }

    @Test
    public void shouldDeleteSchuldner() {
        // given
        testee.saveOrUpdate(playerMock);

        // when
        testee.deletePlayer(PLAYER_ID);

        // then
        final Optional<Player> result = testee.findById(PLAYER_ID);
        assertThat(result.isPresent()).isFalse();

    }

}
