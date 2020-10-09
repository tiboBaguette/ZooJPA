package com.realdolmen.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int maxPeople;
    private double entryFee;

    @OneToMany(mappedBy = "zoo")
    private List<Animal> animals = new ArrayList<>();

    public Zoo(String name, int maxPeople, double entryFee) {
        this.name = name;
        this.maxPeople = maxPeople;
        this.entryFee = entryFee;
    }

    public Zoo() {
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxPeople=" + maxPeople +
                ", entryFee=" + entryFee +
                ", animals=" + animals +
                '}';
    }
}
