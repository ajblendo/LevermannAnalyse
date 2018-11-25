package com.mycompany.levermannanalyse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main (String...args){

        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Book book = new Book();
        book.setAuthor("Memorynotfound");
        book.setTitle("MySQL / Mariadb + Hibernate XML Configuration Example");

        book.setPrice(24.95);
        book.setYear(2016);

        session.save(book);
        tx.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}

