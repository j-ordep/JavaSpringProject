package com.jordep.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging other = (Belonging) o;
        return Objects.equals(id, other.id); // (id, other.id)
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
