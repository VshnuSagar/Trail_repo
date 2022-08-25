package military;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Search {

	public static void main(String[] args) 
	{
		Fighter aircraft=new Fighter();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vishnu");
		EntityManager em=emf.createEntityManager();
		aircraft=em.find(Fighter.class, 3);
		System.out.println("Aircraft id= "+aircraft.getId());
		System.out.println("Aircraft name= "+aircraft.getName());
		System.out.println("Aircraft Type= "+aircraft.getType());
		

	}

}
