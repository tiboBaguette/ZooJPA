package com.realdolmen.model.mamal;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="TIGER")
public class Tiger extends Mamal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Tiger(String name, double weight, int age) {
        super(name, weight, age);
    }

    public Tiger() {
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
