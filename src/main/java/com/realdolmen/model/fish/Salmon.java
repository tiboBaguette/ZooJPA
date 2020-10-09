package com.realdolmen.model.fish;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="SALMON")
public class Salmon extends Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Salmon(String name, double weight, int age, int numberOfFins, boolean hasTeeth) {
        super(name, weight, age, numberOfFins, hasTeeth);
    }

    public Salmon(int numberOfFins, boolean hasTeeth) {
        super(numberOfFins, hasTeeth);
    }

    public Salmon() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
