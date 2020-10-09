package com.realdolmen.model.fish;

import com.realdolmen.model.Animal;

import javax.persistence.*;

@MappedSuperclass
public abstract class Fish extends Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numberOfFins;
    private boolean hasTeeth;
    private enum waterType {
        SALTWATER,
        FRESHWATER
    }

    public Fish(String name, double weight, int age, int numberOfFins, boolean hasTeeth) {
        super(name, weight, age);
        this.numberOfFins = numberOfFins;
        this.hasTeeth = hasTeeth;
    }

    public Fish(int numberOfFins, boolean hasTeeth) {
        this.numberOfFins = numberOfFins;
        this.hasTeeth = hasTeeth;
    }

    public Fish() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public boolean isHasTeeth() {
        return hasTeeth;
    }

    public void setHasTeeth(boolean hasTeeth) {
        this.hasTeeth = hasTeeth;
    }
}
