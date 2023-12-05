package com.uexcel;

import com.uexcel.entity.Account;
import com.uexcel.entity.CreditCard;
import com.uexcel.persistence.PersistingLayer;

import jakarta.persistence.EntityManager;

public class App {
    public static void main(String[] args) {

        EntityManager entityManager = PersistingLayer.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            // CreditCard creditCard = new CreditCard();
            // creditCard.setCardNumber("0888-8989-8989-000");
            // Account account = new Account();
            // account.setAccountNumber("0083938292");
            // account.setType("savings");
            // account.setCreditCard(creditCard);
            // entityManager.persist(account);

            // CreditCard creditCard = entityManager.find(CreditCard.class, 2);
            Account account = entityManager.find(Account.class, 2);

            // account.setCreditCard(creditCard);
            // entityManager.persist(account);

            // account.setCreditCard(creditCard);
            // entityManager.persist(account);

            // System.out.println(account);
            // System.out.println(creditCard);

            account.setUserDetails("user");

            entityManager.persist(account);

            entityManager.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
