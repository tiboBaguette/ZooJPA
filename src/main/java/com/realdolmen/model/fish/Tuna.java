package com.realdolmen.model.fish;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="TUNA")
public class Tuna extends Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Tuna(String name, double weight, int age, int numberOfFins, boolean hasTeeth) {
        super(name, weight, age, numberOfFins, hasTeeth);
    }

    public Tuna(int numberOfFins, boolean hasTeeth) {
        super(numberOfFins, hasTeeth);
    }

    public Tuna() {
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
