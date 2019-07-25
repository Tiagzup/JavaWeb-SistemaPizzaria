package com.br.zup.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.zup.exceptions.MessageNotFoundException;
import com.br.zup.model.PizzaModel;
import com.br.zup.repositories.PizzaRepository;

@Service
public class PizzaService {
	@Autowired
	private PizzaRepository pizzaRepository;
	
	public Iterable<PizzaModel> searchPizzas(){
		return pizzaRepository.findAll();
	}
	public void SavePizza (PizzaModel pizza) {
		pizzaRepository.save(pizza);
	}

	public PizzaModel searchPizzaById(int id) {
		return pizzaRepository.findById(id).get();
	}
	public long quantityPizzas () {
		return pizzaRepository.count();
	}
	public void updatePizza (int id, PizzaModel pizza)  {
		Optional<PizzaModel> optionalPizza = pizzaRepository.findById(id);
		if (!optionalPizza.isPresent()) {
			throw new MessageNotFoundException("Não há pizzas nesse id");
		}
		pizza.setId(id);
		pizzaRepository.save(pizza);
	}
	public  void deletePizza ( int id) {
		pizzaRepository.deleteById(id);

		throw new MessageNotFoundException("Não há pizzas nesse id");
	}
		
	
}
