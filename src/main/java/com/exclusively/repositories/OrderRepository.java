package com.exclusively.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.exclusively.entities.Order;

/**
 * Repository for Order data implemented using Spring Data JPA.
 * 
 * @author Anshul Chauhan
 */
public interface OrderRepository extends Repository<Order, Long> {

	@Query("SELECT count(*) from Order")
	public int countOrders();
}
