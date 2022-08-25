package military;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vishnu");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("SELECT f FROM Fighter f");
		List<Fighter> list=q.getResultList();
		
		for(Fighter f:list)
		{
			System.out.println("ID = "+f.getId());
			System.out.println("NAME = "+f.getName());
			System.out.println("TYPE = "+f.getType());
		}
		
	}

}
