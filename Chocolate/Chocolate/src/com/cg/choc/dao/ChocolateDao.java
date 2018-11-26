package com.cg.choc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.choc.dto.Chocolate;



@Repository("dao")
public class ChocolateDao implements IChocolateDao
{
	@PersistenceContext
	EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Chocolate> getAllChocolates() 
	{
			System.out.println("in dao class method..");
			String str="select chocolate from Chocolate chocolate";

			TypedQuery<Chocolate> query=entityManager.createQuery(str, Chocolate.class);
			
			return query.getResultList();
	}
	@Override
	public Chocolate insertChocolate(Chocolate chocolate)
	{
		entityManager.persist(chocolate);
		entityManager.flush();
		return chocolate;
	}

	@Override
	public Chocolate getChocolateDetails(int chocId) {
		// TODO Auto-generated method stub
		Chocolate choc=entityManager.find(Chocolate.class, chocId);
		return choc;
	}

	@Override
	public int updateChocolate(Chocolate chocolate) {
		// TODO Auto-generated method stub
		entityManager.merge(chocolate);
		return chocolate.getChocId();
	}

	@Override
	public List<Chocolate> deleteChocolate(int chocId) {
		// TODO Auto-generated method stub
		Chocolate chocolate=getChocolateDetails(chocId);
		entityManager.remove(chocolate);
		return getAllChocolates();
	
	}
	}

	
