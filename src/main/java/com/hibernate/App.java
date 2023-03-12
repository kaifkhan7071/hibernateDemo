package com.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import  org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
        
        SessionFactory fact=con.buildSessionFactory();
        
        Emp e=new Emp();
        e.setId(1);
        e.setName("mohd kaif");
        e.setAddress("kurla");
        e.setCity("mumbai");
        e.setSalary(2333333);
        
        Session session = fact.openSession();
        
        Transaction t= session.beginTransaction();
        
        session.save(e);
        
        t.commit();
        session.close();
        
        
        
        
        
    }
}
