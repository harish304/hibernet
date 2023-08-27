package com.hibernet.org.FirstHibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
    public static void main(String[] args) {
        FullName FN = new FullName();
        FN.setFristName("Chinnappaih");
        FN.setMiddlesName("Gari");
        FN.setLastName("Harish");
        
        Student St = new Student();
        St.setId(101);
        St.setName(FN);
        St.setAddress("PKP");
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        ServiceRegistry reg = builder.build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(St);
        tx.commit();
        System.out.println(St);
    }
}
