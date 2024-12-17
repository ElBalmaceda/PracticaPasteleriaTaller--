package com.postgre.bbdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.postgre.bbdd.entity.Pastel;
import com.postgre.bbdd.service.PastelService;

@Controller
@RequestMapping("/pasteles")
public class PersonaController 
{
	@Autowired
	private PastelService pastelService;
	
	
	@GetMapping
	public String findAll(Model model) 
	{
		model.addAttribute("pasteles", pastelService.findAll());
		return "pasteles-list";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioCreacion(Model model)
	{
		model.addAttribute("newPastel",new Pastel());
		return "pastel-new";
	}
	
	@PostMapping
	public String savePastel(Pastel pastel) 
	{
		pastelService.save(pastel);
		return "redirect:/pasteles-list";
	}
	
	@GetMapping("/editar/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") Long id, Model model) 
	{
		model.addAttribute("updatePastel",pastelService.findById(id));
		return "pastel-update";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarPastel(@PathVariable("id") Long id) 
	{
		pastelService.deleteById(id);
		return "redirect:/pasteles-list";
	}
	
	
	
	
	
	
}
