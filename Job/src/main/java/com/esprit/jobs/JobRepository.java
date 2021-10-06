package com.esprit.jobs;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface JobRepository extends JpaRepository<Job, Integer> {
	
	@Query("select j from Job j where j.service like :service")
	public Page<Job> candidatByNom(@Param("service") String j, Pageable pageable);

}
