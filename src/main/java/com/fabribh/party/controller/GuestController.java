package com.fabribh.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fabribh.party.model.Guest;
import com.fabribh.party.repository.Guests;

@Controller
@RequestMapping("/guests")
public class GuestController {
	
	@Autowired
	private Guests guests;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListGuests");
		
		modelAndView.addObject("guests", guests.findAll());
		modelAndView.addObject(new Guest());
	
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Guest guest) {
		this.guests.save(guest);
		return "redirect:/guests";
	}

}
