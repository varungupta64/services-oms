package com.exclusively.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.exclusively.entities.Order;

/**
 * Repository for Order data implemented using Spring Data JPA.
 * 
 * @author Anshul Chauhan
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

	@Query("SELECT count(*) from Order")
	public int countOrders();
}
