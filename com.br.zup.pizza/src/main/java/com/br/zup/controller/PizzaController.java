package com.br.zup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.zup.model.PizzaModel;
import com.br.zup.services.PizzaService;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping
	public ResponseEntity searchPizzas() {
		if(pizzaService.quantityPizzas()> 0 ) {
			return ResponseEntity.ok(pizzaService.searchPizzas());
		}
		return ResponseEntity.noContent().build();
	}
	@GetMapping("{id}")
	public ResponseEntity<?> searchPizzaById (@PathVariable int id, PizzaModel pizza){
		pizzaService.searchPizzaById(id);
		return ResponseEntity.ok(pizza);
	}
	@PostMapping
	public ResponseEntity<PizzaModel> createPizza(@Valid @RequestBody  PizzaModel pizza){
		pizzaService.SavePizza(pizza);
		return ResponseEntity.status(HttpStatus.CREATED).body(pizza);
	}
	@PutMapping("{id}")
	public ResponseEntity<PizzaModel> updatePizza (@PathVariable int id, @RequestBody PizzaModel pizza){
		pizzaService.updatePizza(id, pizza);
		return ResponseEntity.ok(pizza);
	}
	@DeleteMapping("{id}")
	public ResponseEntity deletePizza (@PathVariable int id) {
		pizzaService.deletePizza(id);
		return ResponseEntity.ok().build();
	}
}














