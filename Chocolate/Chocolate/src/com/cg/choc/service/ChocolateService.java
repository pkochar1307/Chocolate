package com.cg.choc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.choc.dao.IChocolateDao;
import com.cg.choc.dto.Chocolate;
@Service("service")
@Transactional
public class ChocolateService implements IChocolateService
{
	@Autowired
	IChocolateDao dao;
	@Override
	public List<Chocolate> getAllChocolates() 
	{
		return dao.getAllChocolates();
	}
	@Override
	public Chocolate insertChocolate(Chocolate chocolate)
	{
		return dao.insertChocolate(chocolate);
	}
	@Override
	public Chocolate getChocolateDetails(int chocId) {
		// TODO Auto-generated method stub
		return dao.getChocolateDetails(chocId);
	}
	@Override
	public int updateChocolate(Chocolate chocolate) {
		// TODO Auto-generated method stub
		return dao.updateChocolate(chocolate);
	}
	@Override
	public List<Chocolate> deleteChocolate(int chocId) {
		// TODO Auto-generated method stub
		return dao.deleteChocolate(chocId);
	}
}
