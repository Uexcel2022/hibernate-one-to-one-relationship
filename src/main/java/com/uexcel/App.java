package com.uexcel;

import com.uexcel.persistence.PersistingLayer;

import jakarta.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        EntityManager entityManager = PersistingLayer.getEntityManager();
        try {
            entityManager.getTransaction().begin();

            entityManager.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
