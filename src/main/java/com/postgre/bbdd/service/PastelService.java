package com.postgre.bbdd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgre.bbdd.entity.Pastel;
import com.postgre.bbdd.repository.PastelRepository;

@Service
public class PastelService implements IService
{
	@Autowired
	private PastelRepository pastelRepository;

	@Override
	public List<Pastel> findAll() {
		return pastelRepository.findAll();
	}

	@Override
	public Pastel findById(Long id) {
		return pastelRepository.findById(id).get();
	}

	@Override
	public Pastel save(Pastel pastel) {
		return pastelRepository.save(pastel);
	}

	@Override
	public void deleteById(Long id) {
		pastelRepository.deleteById(id);
	}
	

}
