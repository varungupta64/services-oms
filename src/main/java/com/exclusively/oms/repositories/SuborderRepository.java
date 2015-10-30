package com.exclusively.oms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.exclusively.oms.entities.Suborder;

public interface SuborderRepository extends CrudRepository<Suborder, Long>{

	List<Suborder> findByMobileNumber(Long mobilenumber);
	
	Suborder findBySuborderId(String suborderId);
	
	@Transactional
	@Modifying
	@Query("update Suborder s set s.status = :status where s.suborderId = :suborderId")
	int updateSuborder(@Param("suborderId") String suborderId,
            @Param("status") String status);
}
