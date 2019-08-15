package de.qacrobat.springdemogradle.player.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@ToString
@Getter
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastname;
    private boolean vip;

    public Player(String name, String lastname, boolean vip){
        this.name = name;
        this.lastname = lastname;
        this.vip = vip;
    }

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
