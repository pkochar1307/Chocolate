package com.cg.choc.service;



import java.util.List;

import com.cg.choc.dto.Chocolate;


public interface IChocolateService 
{
	public List<Chocolate> getAllChocolates();

	Chocolate insertChocolate(Chocolate chocolate);
	
	public Chocolate getChocolateDetails(int chocId);
	
	public int updateChocolate(Chocolate chocolate);
	
	public List<Chocolate >deleteChocolate(int chocId);

}
