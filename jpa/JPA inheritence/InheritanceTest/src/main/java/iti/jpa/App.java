package iti.jpa;

/**
 * Hello world!
 *
 */

import jakarta.persistence.*;
import java.util.Date;


public class App {

    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mmd");
        
        EntityManager em = emf.createEntityManager();
        Person p=new Person();
        p.setFirst_name("abdo");
        p.setLast_name("mhmd");

        Student e1 = new Student();
        e1.setFirst_name("mhmd");
        e1.setLast_name("elgazzar");

        e1.setDepartment("cse");
        System.out.println(e1);

        Teacher e2 = new Teacher();
        e2.setFirst_name("mohsen");
        e2.setLast_name("ahmed");
        e2.setHire_date(new Date());
        System.out.println(e2);

        em.getTransaction().begin();
        em.persist(p);
        em.persist(e1);
        em.persist(e2);
        em.getTransaction().commit();
        em.close();
    }

}
