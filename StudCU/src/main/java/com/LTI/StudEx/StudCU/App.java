package com.LTI.StudEx.StudCU;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main(String[] args)
    {
        Configuration c=new Configuration().configure();
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(c.getProperties());
        SessionFactory sf=c.buildSessionFactory(builder.build());
        Session session=sf.openSession();
        Students stud=new Students();
        session.beginTransaction();
        stud.setId(262);
        stud.setStudName("Pavi");
        stud.setRollNo(25);
        stud.setBranch("FULL STACK");

        session.update(stud);
//        stud.setId(281);
//        stud.setStudName("Bensha");
//        stud.setRollNo(84);
//        session.update(stud);
        
        session.getTransaction().commit();
    }
}
