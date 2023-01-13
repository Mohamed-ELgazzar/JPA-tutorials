package orm.jpaNo1;

import javax.persistence.*;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AccountPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Account c = entityManager.find(Account.class, 1);
        Account c2 = new Account();
        c2.setUserName("asaqsq");
        c2.setFullName("wqwwwss");
        c2.setPassword("ewwwqw");

        entityManager.getTransaction().begin();
        entityManager.persist(c2);
        entityManager.getTransaction().commit();
    }
}
