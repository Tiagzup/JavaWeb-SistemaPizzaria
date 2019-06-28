package com.br.zup.pizza.Services;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.zup.model.PizzaModel; 

@Service
public class PizzaService {
	private Map<Integer, PizzaModel>  Pizzas = new HashMap<Integer, PizzaModel>() {
		{
		put(1, PizzaModel("Sabor", "Massa", "Tipo de Borda", "Valor")); }}
			

		
		public Collection<PizzaModel> menuPizzas(){
			return this.Pizzas.values();
			
		}
		
		public void novasPizzas (PizzaModel pizzaModel) {
			Pizzas.put(Pizzas.size()+1, pizzaModel);
		}
		
	
}
