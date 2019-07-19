package de.qacrobat.springdemogradle.player.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
@Getter
public class Player {
    private String name;
    private String lastname;
    private final Long id;
    private boolean vip;

    public void updateName(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Player player = (Player) o;
        return name.equals(player.name) &&
                lastname.equals(player.lastname) &&
                id.equals(player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
