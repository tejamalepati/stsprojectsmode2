package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.model.Batch;

public interface BatchDaoRepository extends CrudRepository<Batch, Integer> {

	public Batch findByBatchId(int batchId);
@Query("select  b from Batch b where course= ?1")
	public List<Batch> findByCourse(String course); 
	

}
