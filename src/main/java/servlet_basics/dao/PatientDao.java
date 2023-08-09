package servlet_basics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_basics.dto.PatientDto;

public class PatientDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(PatientDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}

	public String deleteById(int cid) {
		PatientDto d1 = entityManager.find(PatientDto.class, cid);

		if (d1 != null) {
			entityTransaction.begin();
			entityManager.remove(d1);
			entityTransaction.commit();
			return "data is deleted";
		} else
			return "data is not found";
	}

	public Object fetchById(int cid) {
		// TODO Auto-generated method stub
		PatientDto d2 = entityManager.find(PatientDto.class, cid);
		if (d2 != null)
			return d2;
		else
			return "no data found";
	}

	public List<PatientDto> fecthAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select data from PatientDto data");
		List<PatientDto> lct = query.getResultList();
		return lct;
	}

	public String update(int cid, Long cnumber) {
		// TODO Auto-generated method stub
		PatientDto d1 = entityManager.find(PatientDto.class, cid);
		d1.setNumber(cnumber);

		entityTransaction.begin();
		entityManager.merge(d1);
		entityTransaction.commit();

		return "updated succesfully";
	}

	public void updateAll(PatientDto dto) {
		entityTransaction.begin();
		entityManager.merge(dto);
		entityTransaction.commit();
	}

	public String deleteAll() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select data from PatientDto data");
		List<PatientDto> lct=query.getResultList();
		for(PatientDto d:lct)
		{
			entityTransaction.begin();
			entityManager.remove(d);
			entityTransaction.commit();
		}
		return "all data has been deleted succesfully";
	}

}
