package iti.lab3;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mmd");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        User u = new User("mhmd@gmail.com", "123,smart village,cairo", "+0258550", "0105505", new Date(), new Date(),
                "mhmd elgazzar", "root", "mohamed elgazzar");
        Buyer b = new Buyer(u, "2000");
        Seller s = new Seller(u, "35000");
        Category c = new Category("20", "the quatity of categories");
        Set<Category> c1 = new HashSet<>();
        c1.add(c);

        Product p = new Product(s, "tea", "valid for 3 years", "lipton", new Date(), new Date(), 100, new Date(),
                new Date(), c1);

        em.persist(u);
        em.persist(b);
        em.persist(s);
        em.persist(c);
        em.persist(p);

        em.getTransaction().commit();

        em.getTransaction().begin();
        BuyerBuyProductId bbpid = new BuyerBuyProductId(b.getId(), p.getId());
        BuyerBidProductId bidpid = new BuyerBidProductId(b.getId(), p.getId());

        BuyerBuyProduct bbp = new BuyerBuyProduct(bbpid, b, p, new Date(), 155.5f, 200);
        BuyerBidProduct bidp = new BuyerBidProduct(bidpid, b, p, new Date(), 155.5f, 200);

        em.persist(bbp);
        em.persist(bidp);
        em.getTransaction().commit();

        System.out.println("*************************************************");

        showTable(em, "Select * from User");
        System.out.println("\n*************************************************\n");
        showTable(em, "Select * from Category");
        System.out.println("\n*************************************************\n");
        showTable(em, "Select * from seller");
        System.out.println("\n*************************************************\n");

        showTable(em, "Select * from buyer");
        System.out.println("\n*************************************************\n");

        showTable(em, "Select * from product");
        System.out.println("\n*************************************************\n");

        showTable(em, "Select * from product_has_category");
        System.out.println("\n*************************************************\n");

        showTable(em, "Select * from buyer_buy_product");
        System.out.println("\n*************************************************\n");

        showTable(em, "Select * from buyer_bid_product");
        System.out.println("\n*************************************************\n");

    }

    public static void showTable(EntityManager em, String s) {
        System.out.println(s);
        Query query = em.createNativeQuery(s);
        List list = query.getResultList();
        for (Object o : list) {
            if (o instanceof Object[]) {
                System.out.println(Arrays.toString((Object[]) o));
            } else {
                System.out.println(o);
            }
        }
    }

}
