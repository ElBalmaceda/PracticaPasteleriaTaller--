package com.postgre.bbdd.service;

import java.util.List;

import com.postgre.bbdd.entity.Pastel;

public interface IService 
{
	public List<Pastel> findAll();
	public Pastel findById(Long id);
	public Pastel save(Pastel pastel);
	public void deleteById(Long id);
}
