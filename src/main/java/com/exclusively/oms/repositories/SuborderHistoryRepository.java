package com.exclusively.oms.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.exclusively.oms.entities.SuborderHistory;

public interface SuborderHistoryRepository extends PagingAndSortingRepository<SuborderHistory, Long>{

	List<SuborderHistory> findBySuborderId(String suborderId,Pageable pageable);
}
