package military;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) 
	{
		Fighter aircraft=new Fighter();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vishnu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction t=em.getTransaction();
		
		aircraft=em.find(Fighter.class, 7);
		t.begin();
		em.remove(aircraft);
		t.commit();

	}

}
