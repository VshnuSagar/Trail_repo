package military;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updation {

	public static void main(String[] args) 
	{
		Fighter aircraft=new Fighter();
		aircraft.setId(15);
		aircraft.setName("Mil M-17 V5");
		aircraft.setType("Heavy Combat/Troop Helicoptor");
		aircraft.setMake("Kazan helicopter Plant");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vishnu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction t=em.getTransaction();
		
		t.begin();
		em.merge(aircraft);
		t.commit();
	}

}
