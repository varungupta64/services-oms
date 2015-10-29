package com.exclusively.oms.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exclusively.oms.entities.Suborder;

public interface SuborderRepository extends CrudRepository<Suborder, Long>{

	List<Suborder> findByMobileNumber(Long mobilenumber);
}
