package com.br.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.pizza.Services.PizzaService;

@Controller
public class PizzaController {
	@Autowired
	PizzaService pizzaService;
	
	@GetMapping
	public ModelAndView menuPizzas () {
		ModelAndView modelAndView = new ModelAndView("menuPizzas.html");
		modelAndView.addObject("Pizzas" PizzaService.menuPizzas());
		return modelAndView;
	}
}
