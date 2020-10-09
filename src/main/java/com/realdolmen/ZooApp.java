package com.realdolmen;

import com.realdolmen.model.Zoo;
import com.realdolmen.model.fish.Salmon;
import com.realdolmen.model.fish.Tuna;
import com.realdolmen.model.mamal.Elephant;
import com.realdolmen.model.mamal.Tiger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ZooApp {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", 250, 19.99);
        Zoo mySecondZoo = new Zoo("My Second Zoo", 500, 24.99);

        Tiger tiger1 = new Tiger("tiger1", 62.3, 14);
        myZoo.addAnimal(tiger1);
        Elephant elephant1 = new Elephant("elephant1", 420, 63);
        myZoo.addAnimal(elephant1);
        Salmon salmon1 = new Salmon("salmon1", 3.2, 3,4, true);
        myZoo.addAnimal(salmon1);
        Tuna tuna1 = new Tuna("tuna1", 3.7, 2, 2, true);
        myZoo.addAnimal(tuna1);

        Tiger tiger2 = new Tiger("tiger2", 65, 10);
        mySecondZoo.addAnimal(tiger2);


        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("mysqlcontainerdropcreate");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();
            em.persist(tiger1);
            em.persist(elephant1);
            em.persist(salmon1);
            em.persist(tuna1);
            em.persist(myZoo);
            em.persist(tiger2);
            em.persist(mySecondZoo);
            tx.commit();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
