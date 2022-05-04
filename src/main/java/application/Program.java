package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("artuxsouto");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 3);
		
		System.out.println(p);

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
