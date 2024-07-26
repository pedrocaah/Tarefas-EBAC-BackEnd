package org.example;

import domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("task");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Marca marca = new Marca();
        marca.setNome("Renault");

        Carro carro1 = new Carro();
        carro1.setModelo("Sandero");
        carro1.setMarca(marca);

        Carro carro2 = new Carro();
        carro2.setModelo("Duster");
        carro2.setMarca(marca);

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);

        marca.setCarros(carros);

        entityManager.getTransaction().begin();
        entityManager.persist(marca);
        entityManager.getTransaction().commit();

        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("Retrovisor");
        acessorio1.setCarro(carro1);

        Acessorio acessorio2 = new Acessorio();
        acessorio2.setNome("Volante");
        acessorio2.setCarro(carro1);

        List<Acessorio> acessoriosCarro1 = new ArrayList<>();
        acessoriosCarro1.add(acessorio1);
        acessoriosCarro1.add(acessorio2);

        carro1.setAcessorios(acessoriosCarro1);

        entityManager.getTransaction().begin();
        entityManager.persist(acessorio1);
        entityManager.persist(acessorio2);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
