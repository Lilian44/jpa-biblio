package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();

		TypedQuery<Livre> query1 = em.createQuery("select l from Livre l ", Livre.class);

		List<Livre> resultLivre = query1.getResultList();

		for (int i = 0; i < resultLivre.size(); i++) {
			System.out.println(resultLivre.get(i).getTitre());
		}

		Emprunt emprunt = em.find(Emprunt.class, 1);

		System.out.println("Les Livres de l'emprunt " + emprunt.getId() + " sont :");
		for (Livre livreEmprunt : emprunt.getLivres()) {
			System.out.println(livreEmprunt.getTitre());
		}

	}

}
