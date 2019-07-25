package com.br.zup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.model.PizzaModel;

@Repository
public interface PizzaRepository extends CrudRepository<PizzaModel, Integer>  {

}
