package com.realdolmen.model.mamal;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="ELEPHANT")
public class Elephant extends Mamal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Elephant(String name, double weight, int age) {
        super(name, weight, age);
    }

    public Elephant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
