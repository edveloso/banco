package br.com.edveloso.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("manager");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Seller seller = new Seller();
        seller.setMinPrice(10l);
        seller.setName("Jose");
        em.persist(seller);
        Bidder bidder = new Bidder();
        bidder.setBid(20l);
        bidder.setName("antonio");
        em.persist(bidder);
        em.getTransaction().commit();
        em.close();
        factory.close();
        System.out.println(seller.getId());
        System.out.println(seller.getName());
        System.out.println(seller.getMinPrice());
        System.out.println(bidder.getId());
        System.out.println(bidder.getName());
        System.out.println(bidder.getBid());
    }
}
