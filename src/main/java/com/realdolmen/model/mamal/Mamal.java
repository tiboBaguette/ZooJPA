package com.realdolmen.model.mamal;

import com.realdolmen.model.Animal;

import javax.persistence.*;

@MappedSuperclass
public abstract class Mamal extends Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private enum gender {
        MALE,
        FEMALE
    }
    private enum type {
        CARNIVORE,
        HERBIVORE,
        OMNIVORE
    }

    public Mamal(String name, double weight, int age) {
        super(name, weight, age);
    }

    public Mamal() {
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
